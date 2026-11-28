# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-0f56c8c8-865e-466d-85c0-db5887eca3db` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-138c5717-c76a-48dd-9fec-8e931546260e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-93eacb67-7f1b-405a-9873-36048776bf3d` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-f25e4598-a783-4a6d-af4b-0df26ff5a335` |
| 5 | `GET /v1/accounts/me` | 503 | 23 | `qa-a91a9839-7ab0-420c-9ba3-1349111123ac` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-9c591b92-598c-4dc1-80f8-59732baad581` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-c425c8f6-4f29-49e6-a3a9-05e435f0485c` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-f1c9708e-6551-452a-b421-70615ee66f34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-add033bc-b7ef-4c96-9c5c-3a55fa2b3838` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-bca61f71-6016-4d1e-b022-ef7d0cf5fe38` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0f56c8c8-865e-466d-85c0-db5887eca3db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f56c8c8-865e-466d-85c0-db5887eca3db
Content-Type: application/json

--- request body ---
{"handle":"qa-8d5d128f0087","displayName":"QA 8d5d128f0087","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f56c8c8-865e-466d-85c0-db5887eca3db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-8d5d128f0087
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de8ea693-180b-491d-83ec-7e99c512842d","handle":"qa-8d5d128f0087","displayName":"QA 8d5d128f0087","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.371500327Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-138c5717-c76a-48dd-9fec-8e931546260e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138c5717-c76a-48dd-9fec-8e931546260e
Content-Type: application/json

--- request body ---
{"handle":"qa-972773470e95","displayName":"QA 972773470e95","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-138c5717-c76a-48dd-9fec-8e931546260e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-972773470e95
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e78c6ff-037a-40ee-84f9-852e5a281780","handle":"qa-972773470e95","displayName":"QA 972773470e95","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.414839723Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-93eacb67-7f1b-405a-9873-36048776bf3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93eacb67-7f1b-405a-9873-36048776bf3d
Content-Type: application/json

--- request body ---
{"handle":"qa-8d5d128f0087","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-93eacb67-7f1b-405a-9873-36048776bf3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de8ea693-180b-491d-83ec-7e99c512842d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f25e4598-a783-4a6d-af4b-0df26ff5a335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25e4598-a783-4a6d-af4b-0df26ff5a335
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-972773470e95","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f25e4598-a783-4a6d-af4b-0df26ff5a335
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
Location: /v1/conversations/cnv_bb2796db-ec0f-4a0c-b9bb-ff438f13720c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bb2796db-ec0f-4a0c-b9bb-ff438f13720c","subject":"Error contract","status":"open","region":"eu","participants":["qa-8d5d128f0087","qa-972773470e95"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.509138589Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a91a9839-7ab0-420c-9ba3-1349111123ac

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: aa124fc3-afb8-4c26-aaa8-f15f8889685f
X-Correlation-Id: qa-a91a9839-7ab0-420c-9ba3-1349111123ac
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a91a9839-7ab0-420c-9ba3-1349111123ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a91a9839-7ab0-420c-9ba3-1349111123ac"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9c591b92-598c-4dc1-80f8-59732baad581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c591b92-598c-4dc1-80f8-59732baad581
Content-Type: application/json

--- request body ---
{"handle":"qa-972773470e95","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c591b92-598c-4dc1-80f8-59732baad581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e78c6ff-037a-40ee-84f9-852e5a281780"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c425c8f6-4f29-49e6-a3a9-05e435f0485c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c425c8f6-4f29-49e6-a3a9-05e435f0485c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c425c8f6-4f29-49e6-a3a9-05e435f0485c
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
correlation: qa-f1c9708e-6551-452a-b421-70615ee66f34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c9708e-6551-452a-b421-70615ee66f34
Content-Type: application/json

--- request body ---
{"handle":"qa-972773470e95","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1c9708e-6551-452a-b421-70615ee66f34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1c9708e-6551-452a-b421-70615ee66f34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-add033bc-b7ef-4c96-9c5c-3a55fa2b3838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-add033bc-b7ef-4c96-9c5c-3a55fa2b3838
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-add033bc-b7ef-4c96-9c5c-3a55fa2b3838
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
correlation: qa-bca61f71-6016-4d1e-b022-ef7d0cf5fe38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca61f71-6016-4d1e-b022-ef7d0cf5fe38
Content-Type: application/json

--- request body ---
{"handle":"qa-8d5d128f0087","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bca61f71-6016-4d1e-b022-ef7d0cf5fe38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bca61f71-6016-4d1e-b022-ef7d0cf5fe38"}
```
