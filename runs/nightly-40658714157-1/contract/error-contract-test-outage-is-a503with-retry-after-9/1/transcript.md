# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-3d2db52b-21bd-4f51-8ad5-935f48f2886c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-9a6ea051-dccf-4bc9-ac52-15a47c709db2` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-5fbcd57a-89c8-4f9d-a1d1-3b4b1ad47806` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-646df15b-35de-49e3-a2ed-6d6559a1f55d` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 17 | `qa-fea41568-3e2d-4aaa-b8eb-b49b6b4cd177` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-7cc6edfb-8664-4784-add4-ba0393275519` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-64fef293-3888-4ff8-acfb-f5461270ae51` |
| 8 | `POST /v1/auth/token` | 401 | 2 | `qa-d886d587-9571-457c-a9ab-ab907ef1276f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7210cff3-6c20-4c1a-96b8-8a95aaa199a0` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-90ea0453-9790-49e5-a556-99b9fd8159ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d2db52b-21bd-4f51-8ad5-935f48f2886c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2db52b-21bd-4f51-8ad5-935f48f2886c
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d35dbd2c8d","displayName":"QA b6d35dbd2c8d","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2db52b-21bd-4f51-8ad5-935f48f2886c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Location: /v1/accounts/qa-b6d35dbd2c8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_891bdf5d-5f72-416b-ae44-ef8ec6ba5335","handle":"qa-b6d35dbd2c8d","displayName":"QA b6d35dbd2c8d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.676061217Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a6ea051-dccf-4bc9-ac52-15a47c709db2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6ea051-dccf-4bc9-ac52-15a47c709db2
Content-Type: application/json

--- request body ---
{"handle":"qa-dfdec038e190","displayName":"QA dfdec038e190","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6ea051-dccf-4bc9-ac52-15a47c709db2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-dfdec038e190
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c81d019-702f-41a0-969c-1dec94f1eb69","handle":"qa-dfdec038e190","displayName":"QA dfdec038e190","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.709021403Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5fbcd57a-89c8-4f9d-a1d1-3b4b1ad47806

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fbcd57a-89c8-4f9d-a1d1-3b4b1ad47806
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d35dbd2c8d","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fbcd57a-89c8-4f9d-a1d1-3b4b1ad47806
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_891bdf5d-5f72-416b-ae44-ef8ec6ba5335"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-646df15b-35de-49e3-a2ed-6d6559a1f55d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646df15b-35de-49e3-a2ed-6d6559a1f55d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dfdec038e190","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-646df15b-35de-49e3-a2ed-6d6559a1f55d
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
Location: /v1/conversations/cnv_24717fc7-31ea-415d-bf36-0ade1f8526d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_24717fc7-31ea-415d-bf36-0ade1f8526d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-b6d35dbd2c8d","qa-dfdec038e190"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.779419275Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_24717fc7-31ea-415d-bf36-0ade1f8526d2/messages
correlation: qa-fea41568-3e2d-4aaa-b8eb-b49b6b4cd177

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: dc368cee-49f0-465c-8a7a-48b0d8c5ee9a
X-Correlation-Id: qa-fea41568-3e2d-4aaa-b8eb-b49b6b4cd177
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fea41568-3e2d-4aaa-b8eb-b49b6b4cd177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_24717fc7-31ea-415d-bf36-0ade1f8526d2/messages","correlationId":"qa-fea41568-3e2d-4aaa-b8eb-b49b6b4cd177"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7cc6edfb-8664-4784-add4-ba0393275519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc6edfb-8664-4784-add4-ba0393275519
Content-Type: application/json

--- request body ---
{"handle":"qa-dfdec038e190","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cc6edfb-8664-4784-add4-ba0393275519
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c81d019-702f-41a0-969c-1dec94f1eb69"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64fef293-3888-4ff8-acfb-f5461270ae51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64fef293-3888-4ff8-acfb-f5461270ae51
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64fef293-3888-4ff8-acfb-f5461270ae51
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
correlation: qa-d886d587-9571-457c-a9ab-ab907ef1276f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d886d587-9571-457c-a9ab-ab907ef1276f
Content-Type: application/json

--- request body ---
{"handle":"qa-dfdec038e190","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d886d587-9571-457c-a9ab-ab907ef1276f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d886d587-9571-457c-a9ab-ab907ef1276f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7210cff3-6c20-4c1a-96b8-8a95aaa199a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7210cff3-6c20-4c1a-96b8-8a95aaa199a0
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7210cff3-6c20-4c1a-96b8-8a95aaa199a0
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
correlation: qa-90ea0453-9790-49e5-a556-99b9fd8159ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90ea0453-9790-49e5-a556-99b9fd8159ab
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d35dbd2c8d","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90ea0453-9790-49e5-a556-99b9fd8159ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90ea0453-9790-49e5-a556-99b9fd8159ab"}
```
