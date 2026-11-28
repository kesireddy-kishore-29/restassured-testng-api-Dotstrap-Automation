# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-b9a449c8-612b-46f3-8778-f09dbdbd129c` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-ff84a847-a6d4-4ee2-b64a-5ef6f9a5badf` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-87b12665-6a4d-4c66-9598-ef426cf2da68` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8cb1c185-ac02-48c1-9a7c-5628b4e091cd` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 23 | `qa-3df74734-87d7-423a-8370-d12a37cd7105` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-74b285e9-c1b3-4e5c-ae98-784b272644f0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-1bd9b18d-b16c-4a24-8d8d-27dd2a0cb73e` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-fc2019bf-5352-45fe-8708-448140b301e0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1b26115c-793f-41a0-8028-7a5d2628edef` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-672c51a1-83fb-4424-b513-401b08693412` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9a449c8-612b-46f3-8778-f09dbdbd129c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9a449c8-612b-46f3-8778-f09dbdbd129c
Content-Type: application/json

--- request body ---
{"handle":"qa-a32174e9e995","displayName":"QA a32174e9e995","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9a449c8-612b-46f3-8778-f09dbdbd129c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-a32174e9e995
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5f0223f-46fa-43a0-9095-531e2ec81bf4","handle":"qa-a32174e9e995","displayName":"QA a32174e9e995","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.550808342Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ff84a847-a6d4-4ee2-b64a-5ef6f9a5badf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff84a847-a6d4-4ee2-b64a-5ef6f9a5badf
Content-Type: application/json

--- request body ---
{"handle":"qa-ada5bdc48053","displayName":"QA ada5bdc48053","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff84a847-a6d4-4ee2-b64a-5ef6f9a5badf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-ada5bdc48053
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44594312-3ce4-4c4b-85bd-9356011906f6","handle":"qa-ada5bdc48053","displayName":"QA ada5bdc48053","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.571947616Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-87b12665-6a4d-4c66-9598-ef426cf2da68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87b12665-6a4d-4c66-9598-ef426cf2da68
Content-Type: application/json

--- request body ---
{"handle":"qa-a32174e9e995","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-87b12665-6a4d-4c66-9598-ef426cf2da68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5f0223f-46fa-43a0-9095-531e2ec81bf4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8cb1c185-ac02-48c1-9a7c-5628b4e091cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb1c185-ac02-48c1-9a7c-5628b4e091cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ada5bdc48053","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cb1c185-ac02-48c1-9a7c-5628b4e091cd
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
Location: /v1/conversations/cnv_ad132478-7989-4b6c-a219-b0f5c21c348b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad132478-7989-4b6c-a219-b0f5c21c348b","subject":"Error contract","status":"open","region":"eu","participants":["qa-a32174e9e995","qa-ada5bdc48053"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.639881157Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a32174e9e995
correlation: qa-3df74734-87d7-423a-8370-d12a37cd7105

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a7172d34-8c73-43b3-a796-8eaae2eed5c2
X-Correlation-Id: qa-3df74734-87d7-423a-8370-d12a37cd7105
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3df74734-87d7-423a-8370-d12a37cd7105
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-a32174e9e995","correlationId":"qa-3df74734-87d7-423a-8370-d12a37cd7105"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-74b285e9-c1b3-4e5c-ae98-784b272644f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b285e9-c1b3-4e5c-ae98-784b272644f0
Content-Type: application/json

--- request body ---
{"handle":"qa-ada5bdc48053","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-74b285e9-c1b3-4e5c-ae98-784b272644f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44594312-3ce4-4c4b-85bd-9356011906f6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1bd9b18d-b16c-4a24-8d8d-27dd2a0cb73e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bd9b18d-b16c-4a24-8d8d-27dd2a0cb73e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1bd9b18d-b16c-4a24-8d8d-27dd2a0cb73e
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
correlation: qa-fc2019bf-5352-45fe-8708-448140b301e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc2019bf-5352-45fe-8708-448140b301e0
Content-Type: application/json

--- request body ---
{"handle":"qa-ada5bdc48053","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc2019bf-5352-45fe-8708-448140b301e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc2019bf-5352-45fe-8708-448140b301e0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b26115c-793f-41a0-8028-7a5d2628edef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b26115c-793f-41a0-8028-7a5d2628edef
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b26115c-793f-41a0-8028-7a5d2628edef
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
correlation: qa-672c51a1-83fb-4424-b513-401b08693412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672c51a1-83fb-4424-b513-401b08693412
Content-Type: application/json

--- request body ---
{"handle":"qa-a32174e9e995","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-672c51a1-83fb-4424-b513-401b08693412
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-672c51a1-83fb-4424-b513-401b08693412"}
```
