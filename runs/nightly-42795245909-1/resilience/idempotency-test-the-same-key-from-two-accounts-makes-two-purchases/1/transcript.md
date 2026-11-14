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
| 1 | `POST /v1/accounts` | 201 | 279 | `qa-38cf8223-c77c-44e3-98e4-41197dc2bca1` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-42df1f6c-9ccd-4601-8c50-c415c30010a5` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-d8474c03-c360-4460-84d5-6659ea5d2588` |
| 4 | `POST /v1/credits/purchases` | 201 | 36 | `qa-046a1882-8b9a-49d9-9cda-5c6e261ba8b7` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-8c22f22e-84f9-4d0c-81a7-97aad16d4541` |
| 6 | `POST /v1/credits/purchases` | 201 | 24 | `qa-47ef9da3-dd7e-42ba-8ee2-44d4a0cd7140` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-9dd6f36f-6e69-44ce-91e0-97e4f1144db6` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-cb13a5c2-a6a4-4fbd-9023-3a42afa6f7f3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c1118be7-0d4c-4421-9683-c83ae1682be0` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-1776ff42-daec-4c74-a898-a75f4780655b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-38cf8223-c77c-44e3-98e4-41197dc2bca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38cf8223-c77c-44e3-98e4-41197dc2bca1
Content-Type: application/json

--- request body ---
{"handle":"qa-5a456387d794","displayName":"QA 5a456387d794","password":"****","region":"eu"}

--- response: 201 in 279 ms ---
Date: Tue, 10 Nov 2026 09:59:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-38cf8223-c77c-44e3-98e4-41197dc2bca1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-5a456387d794
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49662ec7-0c3c-42ee-933d-9fe595482cb8","handle":"qa-5a456387d794","displayName":"QA 5a456387d794","region":"eu","role":"user","createdAt":"2026-11-10T09:59:27.977700093Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42df1f6c-9ccd-4601-8c50-c415c30010a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42df1f6c-9ccd-4601-8c50-c415c30010a5
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a3c73e767e","displayName":"QA b8a3c73e767e","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-42df1f6c-9ccd-4601-8c50-c415c30010a5
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
Location: /v1/accounts/qa-b8a3c73e767e
X-Served-Region: us
Content-Length: 181

{"id":"acc_7644db38-5cff-4d58-aab7-f617171cb176","handle":"qa-b8a3c73e767e","displayName":"QA b8a3c73e767e","region":"us","role":"user","createdAt":"2026-11-10T09:59:28.244541053Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d8474c03-c360-4460-84d5-6659ea5d2588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8474c03-c360-4460-84d5-6659ea5d2588
Content-Type: application/json

--- request body ---
{"handle":"qa-5a456387d794","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8474c03-c360-4460-84d5-6659ea5d2588
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49662ec7-0c3c-42ee-933d-9fe595482cb8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-046a1882-8b9a-49d9-9cda-5c6e261ba8b7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb7f635e73c94c51954609bc24783066
X-Correlation-Id: qa-046a1882-8b9a-49d9-9cda-5c6e261ba8b7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-046a1882-8b9a-49d9-9cda-5c6e261ba8b7
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
Location: /v1/credits/purchases/pur_9fb139fb-21ae-409f-9e5e-ded10ea1f1a1
Content-Length: 144

{"id":"pur_9fb139fb-21ae-409f-9e5e-ded10ea1f1a1","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.360712269Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8c22f22e-84f9-4d0c-81a7-97aad16d4541

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c22f22e-84f9-4d0c-81a7-97aad16d4541
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a3c73e767e","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c22f22e-84f9-4d0c-81a7-97aad16d4541
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7644db38-5cff-4d58-aab7-f617171cb176"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-47ef9da3-dd7e-42ba-8ee2-44d4a0cd7140

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fb7f635e73c94c51954609bc24783066
X-Correlation-Id: qa-47ef9da3-dd7e-42ba-8ee2-44d4a0cd7140
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-47ef9da3-dd7e-42ba-8ee2-44d4a0cd7140
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
Location: /v1/credits/purchases/pur_8eb05786-3a03-4f8e-b5a1-6e519a691493
Content-Length: 144

{"id":"pur_8eb05786-3a03-4f8e-b5a1-6e519a691493","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-10T09:59:28.443999527Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9dd6f36f-6e69-44ce-91e0-97e4f1144db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dd6f36f-6e69-44ce-91e0-97e4f1144db6
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9dd6f36f-6e69-44ce-91e0-97e4f1144db6
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
correlation: qa-cb13a5c2-a6a4-4fbd-9023-3a42afa6f7f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb13a5c2-a6a4-4fbd-9023-3a42afa6f7f3
Content-Type: application/json

--- request body ---
{"handle":"qa-b8a3c73e767e","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb13a5c2-a6a4-4fbd-9023-3a42afa6f7f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb13a5c2-a6a4-4fbd-9023-3a42afa6f7f3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1118be7-0d4c-4421-9683-c83ae1682be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1118be7-0d4c-4421-9683-c83ae1682be0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1118be7-0d4c-4421-9683-c83ae1682be0
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
correlation: qa-1776ff42-daec-4c74-a898-a75f4780655b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1776ff42-daec-4c74-a898-a75f4780655b
Content-Type: application/json

--- request body ---
{"handle":"qa-5a456387d794","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1776ff42-daec-4c74-a898-a75f4780655b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1776ff42-daec-4c74-a898-a75f4780655b"}
```
