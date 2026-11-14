# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-7362fd8f-141b-48db-83a7-f39a54d88b45` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-676fd097-4663-4f41-8acc-b7165c73286f` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-bb0d2a07-3337-497f-b508-e757cb5b04fe` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-5e947f43-50f1-4237-a4a1-74f5bb7eefea` |
| 5 | `POST /v1/credits/purchases` | 422 | 5 | `qa-ee311427-6935-4b66-810d-faa38314be83` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-c3c976a0-37b7-42cb-92a0-188fa5a936c9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-c97c0833-1d92-47d7-8f43-f11801871fcb` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-ef7fed11-5fcf-45d7-aaea-7f8b20cfca49` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a1a1b9b9-a386-4b31-a25a-f786d82a196d` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-a31e9c60-d614-4bc4-a68a-17bbf9d66a62` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7362fd8f-141b-48db-83a7-f39a54d88b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7362fd8f-141b-48db-83a7-f39a54d88b45
Content-Type: application/json

--- request body ---
{"handle":"qa-8d1856891d92","displayName":"QA 8d1856891d92","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7362fd8f-141b-48db-83a7-f39a54d88b45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-8d1856891d92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_592e4158-3525-497d-951c-f352270d1a0a","handle":"qa-8d1856891d92","displayName":"QA 8d1856891d92","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.191429309Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-676fd097-4663-4f41-8acc-b7165c73286f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-676fd097-4663-4f41-8acc-b7165c73286f
Content-Type: application/json

--- request body ---
{"handle":"qa-fedc27574592","displayName":"QA fedc27574592","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-676fd097-4663-4f41-8acc-b7165c73286f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-fedc27574592
X-Served-Region: eu
Content-Length: 181

{"id":"acc_135df5f9-7d0a-4424-a099-08a9369e04fb","handle":"qa-fedc27574592","displayName":"QA fedc27574592","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.210995409Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bb0d2a07-3337-497f-b508-e757cb5b04fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb0d2a07-3337-497f-b508-e757cb5b04fe
Content-Type: application/json

--- request body ---
{"handle":"qa-8d1856891d92","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb0d2a07-3337-497f-b508-e757cb5b04fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_592e4158-3525-497d-951c-f352270d1a0a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e947f43-50f1-4237-a4a1-74f5bb7eefea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e947f43-50f1-4237-a4a1-74f5bb7eefea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fedc27574592","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e947f43-50f1-4237-a4a1-74f5bb7eefea
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
Location: /v1/conversations/cnv_4da00911-9769-4297-ad96-e5526bb4d4c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4da00911-9769-4297-ad96-e5526bb4d4c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d1856891d92","qa-fedc27574592"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:57.263312580Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ee311427-6935-4b66-810d-faa38314be83

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4f404d51302243b2af198c7616c76ae7
X-Correlation-Id: qa-ee311427-6935-4b66-810d-faa38314be83
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee311427-6935-4b66-810d-faa38314be83
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-ee311427-6935-4b66-810d-faa38314be83","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c3c976a0-37b7-42cb-92a0-188fa5a936c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3c976a0-37b7-42cb-92a0-188fa5a936c9
Content-Type: application/json

--- request body ---
{"handle":"qa-fedc27574592","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3c976a0-37b7-42cb-92a0-188fa5a936c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_135df5f9-7d0a-4424-a099-08a9369e04fb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c97c0833-1d92-47d7-8f43-f11801871fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97c0833-1d92-47d7-8f43-f11801871fcb
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c97c0833-1d92-47d7-8f43-f11801871fcb
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ef7fed11-5fcf-45d7-aaea-7f8b20cfca49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef7fed11-5fcf-45d7-aaea-7f8b20cfca49
Content-Type: application/json

--- request body ---
{"handle":"qa-fedc27574592","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef7fed11-5fcf-45d7-aaea-7f8b20cfca49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef7fed11-5fcf-45d7-aaea-7f8b20cfca49"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1a1b9b9-a386-4b31-a25a-f786d82a196d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1a1b9b9-a386-4b31-a25a-f786d82a196d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1a1b9b9-a386-4b31-a25a-f786d82a196d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a31e9c60-d614-4bc4-a68a-17bbf9d66a62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31e9c60-d614-4bc4-a68a-17bbf9d66a62
Content-Type: application/json

--- request body ---
{"handle":"qa-8d1856891d92","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a31e9c60-d614-4bc4-a68a-17bbf9d66a62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a31e9c60-d614-4bc4-a68a-17bbf9d66a62"}
```
