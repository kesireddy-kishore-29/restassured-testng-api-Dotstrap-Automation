# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-390e5a28-ccfd-43af-a5e9-7bbf448fd4a5` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-18eadbe3-1a16-401d-b78a-ccbe3452e8af` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-948c79e8-a9dd-41ae-aa8e-661c5bd975dd` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-19671264-b8ce-4f66-966c-79aaae487870` |
| 5 | `POST /v1/credits/purchases` | 503 | 54 | `qa-3d5fe8f6-de89-43d4-9226-1aa069f042e3` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-fdc0ed1d-061b-4a36-9e57-83fbdfcd0cd1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d4c1b0c1-1ade-49bb-be0f-98f0342b3b15` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-00ed71f7-23b5-4ace-a96d-f9d43fe0c72e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8b1fa4a5-8ef4-47b7-8002-801088614928` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-6c0dce81-89f2-4c2f-bc4f-e4be0bcca411` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-390e5a28-ccfd-43af-a5e9-7bbf448fd4a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-390e5a28-ccfd-43af-a5e9-7bbf448fd4a5
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6e65c1dd49","displayName":"QA 3a6e65c1dd49","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-390e5a28-ccfd-43af-a5e9-7bbf448fd4a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Location: /v1/accounts/qa-3a6e65c1dd49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66c13f0b-5cb3-430f-bfe8-b7728b1f331d","handle":"qa-3a6e65c1dd49","displayName":"QA 3a6e65c1dd49","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.897447830Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-18eadbe3-1a16-401d-b78a-ccbe3452e8af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eadbe3-1a16-401d-b78a-ccbe3452e8af
Content-Type: application/json

--- request body ---
{"handle":"qa-f6e90953d4c5","displayName":"QA f6e90953d4c5","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-18eadbe3-1a16-401d-b78a-ccbe3452e8af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Location: /v1/accounts/qa-f6e90953d4c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9989f3ee-c84e-4e11-9431-3678d0eaddbb","handle":"qa-f6e90953d4c5","displayName":"QA f6e90953d4c5","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.919633885Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-948c79e8-a9dd-41ae-aa8e-661c5bd975dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-948c79e8-a9dd-41ae-aa8e-661c5bd975dd
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6e65c1dd49","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-948c79e8-a9dd-41ae-aa8e-661c5bd975dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66c13f0b-5cb3-430f-bfe8-b7728b1f331d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-19671264-b8ce-4f66-966c-79aaae487870

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19671264-b8ce-4f66-966c-79aaae487870
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f6e90953d4c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-19671264-b8ce-4f66-966c-79aaae487870
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
Location: /v1/conversations/cnv_db14633e-b79e-453d-93b8-c3b80c564b56
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_db14633e-b79e-453d-93b8-c3b80c564b56","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a6e65c1dd49","qa-f6e90953d4c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.987503901Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3d5fe8f6-de89-43d4-9226-1aa069f042e3

--- request headers ---
Accept: application/json
X-Fault-Key: b35e04b3-004e-498d-8d22-33b91a0783e5
Idempotency-Key: qa-63e91466cfbe494d953f81a298df6ca8
X-Fault: unavailable-once
X-Correlation-Id: qa-3d5fe8f6-de89-43d4-9226-1aa069f042e3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 54 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d5fe8f6-de89-43d4-9226-1aa069f042e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-3d5fe8f6-de89-43d4-9226-1aa069f042e3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fdc0ed1d-061b-4a36-9e57-83fbdfcd0cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc0ed1d-061b-4a36-9e57-83fbdfcd0cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-f6e90953d4c5","password":"****"}

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc0ed1d-061b-4a36-9e57-83fbdfcd0cd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9989f3ee-c84e-4e11-9431-3678d0eaddbb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4c1b0c1-1ade-49bb-be0f-98f0342b3b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4c1b0c1-1ade-49bb-be0f-98f0342b3b15
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4c1b0c1-1ade-49bb-be0f-98f0342b3b15
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
correlation: qa-00ed71f7-23b5-4ace-a96d-f9d43fe0c72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ed71f7-23b5-4ace-a96d-f9d43fe0c72e
Content-Type: application/json

--- request body ---
{"handle":"qa-f6e90953d4c5","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00ed71f7-23b5-4ace-a96d-f9d43fe0c72e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00ed71f7-23b5-4ace-a96d-f9d43fe0c72e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b1fa4a5-8ef4-47b7-8002-801088614928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b1fa4a5-8ef4-47b7-8002-801088614928
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b1fa4a5-8ef4-47b7-8002-801088614928
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
correlation: qa-6c0dce81-89f2-4c2f-bc4f-e4be0bcca411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c0dce81-89f2-4c2f-bc4f-e4be0bcca411
Content-Type: application/json

--- request body ---
{"handle":"qa-3a6e65c1dd49","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c0dce81-89f2-4c2f-bc4f-e4be0bcca411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c0dce81-89f2-4c2f-bc4f-e4be0bcca411"}
```
