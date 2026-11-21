# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-77c4b323-e2de-491e-a01a-d3578e011737` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-6e6c8801-dad6-4aaa-bf3f-9b1ae439f268` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-e03e3130-bea8-454f-8cf2-3203e4fbd9d6` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-f1361353-84e2-4ff0-a9cf-269c8b28f154` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 12 | `qa-cbfe2017-423d-495c-b7ff-fea1daf57c58` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-fed5b427-416f-4ca8-a233-80ccb33d454f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-673dc46e-b508-40d0-b813-538d93d7d046` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-ccf3c4c7-76a8-4344-8899-d918d26a5b10` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-70d2d5b9-99ce-4ff7-9a96-da61f8c1f77c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-e653951a-c16b-4a3f-bd7a-4d4cca5a39cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77c4b323-e2de-491e-a01a-d3578e011737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77c4b323-e2de-491e-a01a-d3578e011737
Content-Type: application/json

--- request body ---
{"handle":"qa-a5453152648f","displayName":"QA a5453152648f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-77c4b323-e2de-491e-a01a-d3578e011737
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-a5453152648f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80d59380-3604-4d33-85e1-8143dea220ef","handle":"qa-a5453152648f","displayName":"QA a5453152648f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.678078164Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6e6c8801-dad6-4aaa-bf3f-9b1ae439f268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6c8801-dad6-4aaa-bf3f-9b1ae439f268
Content-Type: application/json

--- request body ---
{"handle":"qa-15f893fd772c","displayName":"QA 15f893fd772c","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e6c8801-dad6-4aaa-bf3f-9b1ae439f268
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
Location: /v1/accounts/qa-15f893fd772c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72f20882-de79-4b52-aaa1-2cf4045aa880","handle":"qa-15f893fd772c","displayName":"QA 15f893fd772c","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.705939357Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e03e3130-bea8-454f-8cf2-3203e4fbd9d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e03e3130-bea8-454f-8cf2-3203e4fbd9d6
Content-Type: application/json

--- request body ---
{"handle":"qa-a5453152648f","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e03e3130-bea8-454f-8cf2-3203e4fbd9d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80d59380-3604-4d33-85e1-8143dea220ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f1361353-84e2-4ff0-a9cf-269c8b28f154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1361353-84e2-4ff0-a9cf-269c8b28f154
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15f893fd772c","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1361353-84e2-4ff0-a9cf-269c8b28f154
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
Location: /v1/conversations/cnv_1a6d7c49-a1d9-4680-8734-5cf6d7cd302f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a6d7c49-a1d9-4680-8734-5cf6d7cd302f","subject":"Error contract","status":"open","region":"eu","participants":["qa-a5453152648f","qa-15f893fd772c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.797791760Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1a6d7c49-a1d9-4680-8734-5cf6d7cd302f/messages
correlation: qa-cbfe2017-423d-495c-b7ff-fea1daf57c58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbfe2017-423d-495c-b7ff-fea1daf57c58
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbfe2017-423d-495c-b7ff-fea1daf57c58
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_1a6d7c49-a1d9-4680-8734-5cf6d7cd302f/messages","correlationId":"qa-cbfe2017-423d-495c-b7ff-fea1daf57c58","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fed5b427-416f-4ca8-a233-80ccb33d454f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed5b427-416f-4ca8-a233-80ccb33d454f
Content-Type: application/json

--- request body ---
{"handle":"qa-15f893fd772c","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed5b427-416f-4ca8-a233-80ccb33d454f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72f20882-de79-4b52-aaa1-2cf4045aa880"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-673dc46e-b508-40d0-b813-538d93d7d046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-673dc46e-b508-40d0-b813-538d93d7d046
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-673dc46e-b508-40d0-b813-538d93d7d046
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
correlation: qa-ccf3c4c7-76a8-4344-8899-d918d26a5b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf3c4c7-76a8-4344-8899-d918d26a5b10
Content-Type: application/json

--- request body ---
{"handle":"qa-15f893fd772c","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccf3c4c7-76a8-4344-8899-d918d26a5b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccf3c4c7-76a8-4344-8899-d918d26a5b10"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70d2d5b9-99ce-4ff7-9a96-da61f8c1f77c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d2d5b9-99ce-4ff7-9a96-da61f8c1f77c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70d2d5b9-99ce-4ff7-9a96-da61f8c1f77c
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
correlation: qa-e653951a-c16b-4a3f-bd7a-4d4cca5a39cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e653951a-c16b-4a3f-bd7a-4d4cca5a39cf
Content-Type: application/json

--- request body ---
{"handle":"qa-a5453152648f","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e653951a-c16b-4a3f-bd7a-4d4cca5a39cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e653951a-c16b-4a3f-bd7a-4d4cca5a39cf"}
```
