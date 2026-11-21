# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-469e5286-2c8e-4f75-af11-034a276a62be` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-4a9ca08b-eead-4a7b-8200-7320b154ca76` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-4824a928-292d-42f3-bb9e-fae6e7a745fe` |
| 4 | `POST /v1/conversations` | 201 | 2 | `qa-6d71f135-6142-499b-8444-b857241487f3` |
| 5 | `GET /v1/conversations/{id}` | 503 | 20 | `qa-23a98b7f-3a9a-4805-8201-b24c6f81028b` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-caeebe03-2e32-49ed-85b2-201b9d63d731` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3a9b6b0f-1e9d-414b-95d1-5683d484e99e` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-892ad57e-27e8-42ab-bcab-9d030f14feb0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-baee7800-54a0-4011-a6d5-6dddc158351a` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-d42ea067-db33-49dc-a3f1-33a3f9f68603` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-469e5286-2c8e-4f75-af11-034a276a62be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-469e5286-2c8e-4f75-af11-034a276a62be
Content-Type: application/json

--- request body ---
{"handle":"qa-b12dc1db2d41","displayName":"QA b12dc1db2d41","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-469e5286-2c8e-4f75-af11-034a276a62be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-b12dc1db2d41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74ae23db-776a-4830-8218-c46eae046d30","handle":"qa-b12dc1db2d41","displayName":"QA b12dc1db2d41","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.465971237Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4a9ca08b-eead-4a7b-8200-7320b154ca76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9ca08b-eead-4a7b-8200-7320b154ca76
Content-Type: application/json

--- request body ---
{"handle":"qa-f967a5237a4e","displayName":"QA f967a5237a4e","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a9ca08b-eead-4a7b-8200-7320b154ca76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-f967a5237a4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22c109b2-c9ad-4b8d-960e-f355bfb95842","handle":"qa-f967a5237a4e","displayName":"QA f967a5237a4e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.498783778Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4824a928-292d-42f3-bb9e-fae6e7a745fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4824a928-292d-42f3-bb9e-fae6e7a745fe
Content-Type: application/json

--- request body ---
{"handle":"qa-b12dc1db2d41","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4824a928-292d-42f3-bb9e-fae6e7a745fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74ae23db-776a-4830-8218-c46eae046d30"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6d71f135-6142-499b-8444-b857241487f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d71f135-6142-499b-8444-b857241487f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f967a5237a4e","subject":"Error contract","message":"Hi"}

--- response: 201 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d71f135-6142-499b-8444-b857241487f3
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
Location: /v1/conversations/cnv_9df05032-0778-4b16-be53-4632862ae117
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9df05032-0778-4b16-be53-4632862ae117","subject":"Error contract","status":"open","region":"eu","participants":["qa-b12dc1db2d41","qa-f967a5237a4e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.530710745Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_9df05032-0778-4b16-be53-4632862ae117
correlation: qa-23a98b7f-3a9a-4805-8201-b24c6f81028b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d5aedd47-3fdb-459b-884b-6a16b01c8cc6
X-Correlation-Id: qa-23a98b7f-3a9a-4805-8201-b24c6f81028b
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23a98b7f-3a9a-4805-8201-b24c6f81028b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9df05032-0778-4b16-be53-4632862ae117","correlationId":"qa-23a98b7f-3a9a-4805-8201-b24c6f81028b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-caeebe03-2e32-49ed-85b2-201b9d63d731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caeebe03-2e32-49ed-85b2-201b9d63d731
Content-Type: application/json

--- request body ---
{"handle":"qa-f967a5237a4e","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-caeebe03-2e32-49ed-85b2-201b9d63d731
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22c109b2-c9ad-4b8d-960e-f355bfb95842"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a9b6b0f-1e9d-414b-95d1-5683d484e99e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a9b6b0f-1e9d-414b-95d1-5683d484e99e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a9b6b0f-1e9d-414b-95d1-5683d484e99e
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
correlation: qa-892ad57e-27e8-42ab-bcab-9d030f14feb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-892ad57e-27e8-42ab-bcab-9d030f14feb0
Content-Type: application/json

--- request body ---
{"handle":"qa-f967a5237a4e","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-892ad57e-27e8-42ab-bcab-9d030f14feb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-892ad57e-27e8-42ab-bcab-9d030f14feb0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-baee7800-54a0-4011-a6d5-6dddc158351a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baee7800-54a0-4011-a6d5-6dddc158351a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-baee7800-54a0-4011-a6d5-6dddc158351a
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
correlation: qa-d42ea067-db33-49dc-a3f1-33a3f9f68603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42ea067-db33-49dc-a3f1-33a3f9f68603
Content-Type: application/json

--- request body ---
{"handle":"qa-b12dc1db2d41","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d42ea067-db33-49dc-a3f1-33a3f9f68603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d42ea067-db33-49dc-a3f1-33a3f9f68603"}
```
