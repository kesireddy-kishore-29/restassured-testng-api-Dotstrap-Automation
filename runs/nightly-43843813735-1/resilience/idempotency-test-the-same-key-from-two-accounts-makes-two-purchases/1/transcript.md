# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 547 | `qa-e8c7f5ae-7586-4383-9619-f1bc52525b1f` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-6345ab09-b008-48dd-9a6e-fa0da8189c5d` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-3e5f8505-05a7-465a-915b-cff0947fc337` |
| 4 | `POST /v1/credits/purchases` | 201 | 72 | `qa-96fe319e-70fa-47d8-be52-46544ff3522e` |
| 5 | `POST /v1/auth/token` | 200 | 53 | `qa-894491d8-0ea0-4272-8c0a-2cc94d7a2ee3` |
| 6 | `POST /v1/credits/purchases` | 201 | 16 | `qa-fb6539cc-e293-4094-b050-90c16647d409` |
| 7 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-f445f8da-7be2-4d0a-9b20-56ff8ede9d1f` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-d5557202-669a-44b6-b5c8-a5c601c979ac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-2727bf07-041d-4ca7-a3be-7f31c79d3d8f` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-fb9da0b6-61c3-4b40-a45c-054f66584447` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e8c7f5ae-7586-4383-9619-f1bc52525b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8c7f5ae-7586-4383-9619-f1bc52525b1f
Content-Type: application/json

--- request body ---
{"handle":"qa-c0908e161c92","displayName":"QA c0908e161c92","password":"****","region":"eu"}

--- response: 201 in 547 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8c7f5ae-7586-4383-9619-f1bc52525b1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-c0908e161c92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6125c8d-1270-43b6-be50-b8ca75f0eb30","handle":"qa-c0908e161c92","displayName":"QA c0908e161c92","region":"eu","role":"user","createdAt":"2026-11-16T09:53:59.730641481Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6345ab09-b008-48dd-9a6e-fa0da8189c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6345ab09-b008-48dd-9a6e-fa0da8189c5d
Content-Type: application/json

--- request body ---
{"handle":"qa-381d6d49378c","displayName":"QA 381d6d49378c","password":"****","region":"us"}

--- response: 201 in 44 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6345ab09-b008-48dd-9a6e-fa0da8189c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-381d6d49378c
X-Served-Region: us
Content-Length: 181

{"id":"acc_8dfa12e3-c2d9-4897-aa38-688cd07ff555","handle":"qa-381d6d49378c","displayName":"QA 381d6d49378c","region":"us","role":"user","createdAt":"2026-11-16T09:54:00.157039517Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3e5f8505-05a7-465a-915b-cff0947fc337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e5f8505-05a7-465a-915b-cff0947fc337
Content-Type: application/json

--- request body ---
{"handle":"qa-c0908e161c92","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e5f8505-05a7-465a-915b-cff0947fc337
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6125c8d-1270-43b6-be50-b8ca75f0eb30"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-96fe319e-70fa-47d8-be52-46544ff3522e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b2375d0a116c406a94e566fbce624e54
X-Correlation-Id: qa-96fe319e-70fa-47d8-be52-46544ff3522e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 72 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-96fe319e-70fa-47d8-be52-46544ff3522e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_e1622e21-5708-4516-b3d2-03ebef240921
Content-Length: 144

{"id":"pur_e1622e21-5708-4516-b3d2-03ebef240921","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.364943340Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-894491d8-0ea0-4272-8c0a-2cc94d7a2ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-894491d8-0ea0-4272-8c0a-2cc94d7a2ee3
Content-Type: application/json

--- request body ---
{"handle":"qa-381d6d49378c","password":"****"}

--- response: 200 in 53 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-894491d8-0ea0-4272-8c0a-2cc94d7a2ee3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dfa12e3-c2d9-4897-aa38-688cd07ff555"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fb6539cc-e293-4094-b050-90c16647d409

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b2375d0a116c406a94e566fbce624e54
X-Correlation-Id: qa-fb6539cc-e293-4094-b050-90c16647d409
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb6539cc-e293-4094-b050-90c16647d409
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_c71d2672-3e9f-4133-9075-acdc50e5bfd1
Content-Length: 144

{"id":"pur_c71d2672-3e9f-4133-9075-acdc50e5bfd1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-16T09:54:00.502384678Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f445f8da-7be2-4d0a-9b20-56ff8ede9d1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f445f8da-7be2-4d0a-9b20-56ff8ede9d1f
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f445f8da-7be2-4d0a-9b20-56ff8ede9d1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d5557202-669a-44b6-b5c8-a5c601c979ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5557202-669a-44b6-b5c8-a5c601c979ac
Content-Type: application/json

--- request body ---
{"handle":"qa-381d6d49378c","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5557202-669a-44b6-b5c8-a5c601c979ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5557202-669a-44b6-b5c8-a5c601c979ac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2727bf07-041d-4ca7-a3be-7f31c79d3d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2727bf07-041d-4ca7-a3be-7f31c79d3d8f
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2727bf07-041d-4ca7-a3be-7f31c79d3d8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-fb9da0b6-61c3-4b40-a45c-054f66584447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb9da0b6-61c3-4b40-a45c-054f66584447
Content-Type: application/json

--- request body ---
{"handle":"qa-c0908e161c92","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb9da0b6-61c3-4b40-a45c-054f66584447
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb9da0b6-61c3-4b40-a45c-054f66584447"}
```
