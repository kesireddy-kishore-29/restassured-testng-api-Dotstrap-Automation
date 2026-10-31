# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-e0144bd0-59d9-4ec8-a730-e0246dbf77de` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-709a376e-157f-4438-ad55-c1af7e25b163` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-cb6616c5-c4e0-4f26-a483-190983d1eb72` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-fc42d787-415a-4ff3-8a4a-c2f688dab823` |
| 5 | `POST /v1/auth/token` | 415 | 37 | `qa-41807b62-514e-4582-a2a3-dfd56f0a81e0` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-94c1e051-9263-41e5-87a2-bf6b8dfb66e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-774dc4f2-be09-4c11-9519-dcc9dbd2e003` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-49c82dce-bc4a-4b5b-b9b8-b8c4cdc1aa88` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-57525c7e-d238-4c48-a4c0-18fff87b479f` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-c31fc51f-d11c-49ff-a5c5-cbf70836b16c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0144bd0-59d9-4ec8-a730-e0246dbf77de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0144bd0-59d9-4ec8-a730-e0246dbf77de
Content-Type: application/json

--- request body ---
{"handle":"qa-e812638c47a2","displayName":"QA e812638c47a2","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0144bd0-59d9-4ec8-a730-e0246dbf77de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-e812638c47a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5b3e0c9-bef3-43c5-8d4f-029131ee98b7","handle":"qa-e812638c47a2","displayName":"QA e812638c47a2","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.034903265Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-709a376e-157f-4438-ad55-c1af7e25b163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709a376e-157f-4438-ad55-c1af7e25b163
Content-Type: application/json

--- request body ---
{"handle":"qa-c57ec9de0474","displayName":"QA c57ec9de0474","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-709a376e-157f-4438-ad55-c1af7e25b163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-c57ec9de0474
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8882da5d-26ba-47c2-8698-b1ec81245852","handle":"qa-c57ec9de0474","displayName":"QA c57ec9de0474","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.085178305Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cb6616c5-c4e0-4f26-a483-190983d1eb72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb6616c5-c4e0-4f26-a483-190983d1eb72
Content-Type: application/json

--- request body ---
{"handle":"qa-e812638c47a2","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb6616c5-c4e0-4f26-a483-190983d1eb72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5b3e0c9-bef3-43c5-8d4f-029131ee98b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fc42d787-415a-4ff3-8a4a-c2f688dab823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc42d787-415a-4ff3-8a4a-c2f688dab823
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c57ec9de0474","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc42d787-415a-4ff3-8a4a-c2f688dab823
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
Location: /v1/conversations/cnv_2cac1b5f-f2d3-4275-9c5e-fd42589f3098
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2cac1b5f-f2d3-4275-9c5e-fd42589f3098","subject":"Error contract","status":"open","region":"eu","participants":["qa-e812638c47a2","qa-c57ec9de0474"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.171229125Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-41807b62-514e-4582-a2a3-dfd56f0a81e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41807b62-514e-4582-a2a3-dfd56f0a81e0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41807b62-514e-4582-a2a3-dfd56f0a81e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-41807b62-514e-4582-a2a3-dfd56f0a81e0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-94c1e051-9263-41e5-87a2-bf6b8dfb66e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c1e051-9263-41e5-87a2-bf6b8dfb66e3
Content-Type: application/json

--- request body ---
{"handle":"qa-c57ec9de0474","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c1e051-9263-41e5-87a2-bf6b8dfb66e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8882da5d-26ba-47c2-8698-b1ec81245852"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-774dc4f2-be09-4c11-9519-dcc9dbd2e003

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-774dc4f2-be09-4c11-9519-dcc9dbd2e003
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-774dc4f2-be09-4c11-9519-dcc9dbd2e003
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
correlation: qa-49c82dce-bc4a-4b5b-b9b8-b8c4cdc1aa88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49c82dce-bc4a-4b5b-b9b8-b8c4cdc1aa88
Content-Type: application/json

--- request body ---
{"handle":"qa-c57ec9de0474","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49c82dce-bc4a-4b5b-b9b8-b8c4cdc1aa88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49c82dce-bc4a-4b5b-b9b8-b8c4cdc1aa88"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57525c7e-d238-4c48-a4c0-18fff87b479f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57525c7e-d238-4c48-a4c0-18fff87b479f
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57525c7e-d238-4c48-a4c0-18fff87b479f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c31fc51f-d11c-49ff-a5c5-cbf70836b16c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31fc51f-d11c-49ff-a5c5-cbf70836b16c
Content-Type: application/json

--- request body ---
{"handle":"qa-e812638c47a2","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c31fc51f-d11c-49ff-a5c5-cbf70836b16c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c31fc51f-d11c-49ff-a5c5-cbf70836b16c"}
```
