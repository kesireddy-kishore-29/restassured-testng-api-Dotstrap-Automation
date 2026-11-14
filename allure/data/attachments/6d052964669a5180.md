# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-e449e953-928d-45d8-8f3c-85b49aeab0db` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-fd71e67d-d6ef-4e44-8efa-776d3eb2851c` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-39a554c1-6653-4029-a12d-0d83bc9384cd` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-449a5eec-2fa4-4fbb-804b-41ad6329af4e` |
| 5 | `POST /v1/credits/purchases` | 400 | 12 | `qa-fe0e449c-7b3d-49e6-8595-ba9b0cefb8c5` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-cad940b7-38f2-41f4-8454-10ceb3cbeab3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6e1f299f-f4bd-484b-bb4e-65b0376b3299` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-4b299526-6823-4e2b-a1d4-768465c3bdb5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5505dd24-9f82-4615-b519-9b4f6a597567` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-f3b9b95f-c6d2-4485-82e5-89bf0b10aca6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e449e953-928d-45d8-8f3c-85b49aeab0db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e449e953-928d-45d8-8f3c-85b49aeab0db
Content-Type: application/json

--- request body ---
{"handle":"qa-686346a729e8","displayName":"QA 686346a729e8","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e449e953-928d-45d8-8f3c-85b49aeab0db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Location: /v1/accounts/qa-686346a729e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b37860f9-dd3a-44eb-9b97-53efe3ac1c07","handle":"qa-686346a729e8","displayName":"QA 686346a729e8","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.477227613Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fd71e67d-d6ef-4e44-8efa-776d3eb2851c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd71e67d-d6ef-4e44-8efa-776d3eb2851c
Content-Type: application/json

--- request body ---
{"handle":"qa-2d609d64f816","displayName":"QA 2d609d64f816","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd71e67d-d6ef-4e44-8efa-776d3eb2851c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-2d609d64f816
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fccb60d0-37ac-4e70-affd-0e538b45bf42","handle":"qa-2d609d64f816","displayName":"QA 2d609d64f816","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.513755695Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-39a554c1-6653-4029-a12d-0d83bc9384cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a554c1-6653-4029-a12d-0d83bc9384cd
Content-Type: application/json

--- request body ---
{"handle":"qa-686346a729e8","password":"****"}

--- response: 200 in 50 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-39a554c1-6653-4029-a12d-0d83bc9384cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b37860f9-dd3a-44eb-9b97-53efe3ac1c07"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-449a5eec-2fa4-4fbb-804b-41ad6329af4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-449a5eec-2fa4-4fbb-804b-41ad6329af4e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d609d64f816","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-449a5eec-2fa4-4fbb-804b-41ad6329af4e
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
Location: /v1/conversations/cnv_19c294fc-e3ed-432c-956f-f6198a20fd80
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_19c294fc-e3ed-432c-956f-f6198a20fd80","subject":"Error contract","status":"open","region":"eu","participants":["qa-686346a729e8","qa-2d609d64f816"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.589640596Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fe0e449c-7b3d-49e6-8595-ba9b0cefb8c5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e61d828eab124fa09b498144057582d5
X-Correlation-Id: qa-fe0e449c-7b3d-49e6-8595-ba9b0cefb8c5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe0e449c-7b3d-49e6-8595-ba9b0cefb8c5
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-fe0e449c-7b3d-49e6-8595-ba9b0cefb8c5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cad940b7-38f2-41f4-8454-10ceb3cbeab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad940b7-38f2-41f4-8454-10ceb3cbeab3
Content-Type: application/json

--- request body ---
{"handle":"qa-2d609d64f816","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad940b7-38f2-41f4-8454-10ceb3cbeab3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fccb60d0-37ac-4e70-affd-0e538b45bf42"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e1f299f-f4bd-484b-bb4e-65b0376b3299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e1f299f-f4bd-484b-bb4e-65b0376b3299
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e1f299f-f4bd-484b-bb4e-65b0376b3299
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
correlation: qa-4b299526-6823-4e2b-a1d4-768465c3bdb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b299526-6823-4e2b-a1d4-768465c3bdb5
Content-Type: application/json

--- request body ---
{"handle":"qa-2d609d64f816","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b299526-6823-4e2b-a1d4-768465c3bdb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b299526-6823-4e2b-a1d4-768465c3bdb5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5505dd24-9f82-4615-b519-9b4f6a597567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5505dd24-9f82-4615-b519-9b4f6a597567
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5505dd24-9f82-4615-b519-9b4f6a597567
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
correlation: qa-f3b9b95f-c6d2-4485-82e5-89bf0b10aca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b9b95f-c6d2-4485-82e5-89bf0b10aca6
Content-Type: application/json

--- request body ---
{"handle":"qa-686346a729e8","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3b9b95f-c6d2-4485-82e5-89bf0b10aca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3b9b95f-c6d2-4485-82e5-89bf0b10aca6"}
```
