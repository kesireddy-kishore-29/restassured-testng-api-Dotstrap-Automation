# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-fabd446a-35a8-42ae-9767-7087b76cc393` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-c1bf02c2-f93a-4d08-82cb-abccc447b531` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-10efe2db-1a29-4421-b0eb-ab8b64501d3b` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-dc89cc54-8350-44dc-b047-68082368d38c` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 18 | `qa-246620e3-a02e-4f5c-8843-2aff8469b5e3` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-2d731ffc-0a77-421d-9405-8e0d8070acd0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-24027316-18c7-449f-8309-22dfa110877e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-ee4598b4-3cab-4a30-a1bb-4509bc2dde14` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ceb4b363-56a1-4005-a6c8-87e54f513c77` |
| 10 | `POST /v1/auth/token` | 401 | 53 | `qa-25d1e7af-61bf-4f5b-a3ed-a2d5a12a171f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fabd446a-35a8-42ae-9767-7087b76cc393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fabd446a-35a8-42ae-9767-7087b76cc393
Content-Type: application/json

--- request body ---
{"handle":"qa-52a481e4a4be","displayName":"QA 52a481e4a4be","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fabd446a-35a8-42ae-9767-7087b76cc393
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Location: /v1/accounts/qa-52a481e4a4be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e532ce12-522e-4b07-83ac-67d6efea5a64","handle":"qa-52a481e4a4be","displayName":"QA 52a481e4a4be","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.456878629Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c1bf02c2-f93a-4d08-82cb-abccc447b531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1bf02c2-f93a-4d08-82cb-abccc447b531
Content-Type: application/json

--- request body ---
{"handle":"qa-47f332505473","displayName":"QA 47f332505473","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1bf02c2-f93a-4d08-82cb-abccc447b531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-47f332505473
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ec4b9e3-71cf-4461-8133-5a504b106a56","handle":"qa-47f332505473","displayName":"QA 47f332505473","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.499332168Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-10efe2db-1a29-4421-b0eb-ab8b64501d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10efe2db-1a29-4421-b0eb-ab8b64501d3b
Content-Type: application/json

--- request body ---
{"handle":"qa-52a481e4a4be","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-10efe2db-1a29-4421-b0eb-ab8b64501d3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e532ce12-522e-4b07-83ac-67d6efea5a64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc89cc54-8350-44dc-b047-68082368d38c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc89cc54-8350-44dc-b047-68082368d38c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-47f332505473","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc89cc54-8350-44dc-b047-68082368d38c
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
Location: /v1/conversations/cnv_9a3f8228-3298-4056-88b0-c770cc182796
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9a3f8228-3298-4056-88b0-c770cc182796","subject":"Error contract","status":"open","region":"eu","participants":["qa-52a481e4a4be","qa-47f332505473"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.576584244Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9a3f8228-3298-4056-88b0-c770cc182796/messages
correlation: qa-246620e3-a02e-4f5c-8843-2aff8469b5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-246620e3-a02e-4f5c-8843-2aff8469b5e3
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-246620e3-a02e-4f5c-8843-2aff8469b5e3
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_9a3f8228-3298-4056-88b0-c770cc182796/messages","correlationId":"qa-246620e3-a02e-4f5c-8843-2aff8469b5e3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2d731ffc-0a77-421d-9405-8e0d8070acd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d731ffc-0a77-421d-9405-8e0d8070acd0
Content-Type: application/json

--- request body ---
{"handle":"qa-47f332505473","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d731ffc-0a77-421d-9405-8e0d8070acd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ec4b9e3-71cf-4461-8133-5a504b106a56"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24027316-18c7-449f-8309-22dfa110877e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24027316-18c7-449f-8309-22dfa110877e
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24027316-18c7-449f-8309-22dfa110877e
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
correlation: qa-ee4598b4-3cab-4a30-a1bb-4509bc2dde14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee4598b4-3cab-4a30-a1bb-4509bc2dde14
Content-Type: application/json

--- request body ---
{"handle":"qa-47f332505473","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee4598b4-3cab-4a30-a1bb-4509bc2dde14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee4598b4-3cab-4a30-a1bb-4509bc2dde14"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ceb4b363-56a1-4005-a6c8-87e54f513c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceb4b363-56a1-4005-a6c8-87e54f513c77
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ceb4b363-56a1-4005-a6c8-87e54f513c77
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
correlation: qa-25d1e7af-61bf-4f5b-a3ed-a2d5a12a171f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d1e7af-61bf-4f5b-a3ed-a2d5a12a171f
Content-Type: application/json

--- request body ---
{"handle":"qa-52a481e4a4be","password":"****"}

--- response: 401 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25d1e7af-61bf-4f5b-a3ed-a2d5a12a171f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25d1e7af-61bf-4f5b-a3ed-a2d5a12a171f"}
```
