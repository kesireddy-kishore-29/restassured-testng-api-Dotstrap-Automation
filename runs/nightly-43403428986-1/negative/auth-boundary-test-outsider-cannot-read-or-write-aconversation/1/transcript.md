# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-e69d3de2-24d8-45d2-8155-3f74244a9984` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-a2febe6f-1ec4-4f19-a637-431bb821c3de` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-38380aef-e071-45ea-88e8-8d9d341f95c1` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-398e0f9a-1d43-434c-b6a0-369394baac77` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-60dee1b3-4f8f-4fd2-b525-f59be184e930` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-86120a68-df0b-40e6-951c-f720453eaee6` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-2f186eef-7314-433a-baa1-967a96192e74` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-18a8aa6e-fba9-41a0-b93b-ccf8b6bba369` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 22 | `qa-fb50942f-2727-4c8f-ad98-8dfdb23937f0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a05f6841-87da-4836-b6b3-cfba4d71bac4` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-ba5da5dd-a103-45a7-8e24-f7074792dd8e` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-585fc933-945f-4a33-9476-b835062ed03b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-76968180-fef7-48fa-a2a7-90a3d3245998` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-3f9a152a-985a-4689-a1e5-785176a83ba8` |
| 15 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-387ba795-d5cb-40ae-a97a-1b580724ad7c` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-2cf95018-2338-4493-b95c-e0c6eca7ca36` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e69d3de2-24d8-45d2-8155-3f74244a9984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e69d3de2-24d8-45d2-8155-3f74244a9984
Content-Type: application/json

--- request body ---
{"handle":"qa-581d4f6218c3","displayName":"QA 581d4f6218c3","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e69d3de2-24d8-45d2-8155-3f74244a9984
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-581d4f6218c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74bf56a2-d0f6-4bfb-a52f-89b915b18a16","handle":"qa-581d4f6218c3","displayName":"QA 581d4f6218c3","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.306012857Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2febe6f-1ec4-4f19-a637-431bb821c3de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2febe6f-1ec4-4f19-a637-431bb821c3de
Content-Type: application/json

--- request body ---
{"handle":"qa-0e567d6fb04d","displayName":"QA 0e567d6fb04d","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2febe6f-1ec4-4f19-a637-431bb821c3de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-0e567d6fb04d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_630d3312-c4ff-40f7-9c15-d616d721fbd1","handle":"qa-0e567d6fb04d","displayName":"QA 0e567d6fb04d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.362819177Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-38380aef-e071-45ea-88e8-8d9d341f95c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38380aef-e071-45ea-88e8-8d9d341f95c1
Content-Type: application/json

--- request body ---
{"handle":"qa-0c66ae6c15f8","displayName":"QA 0c66ae6c15f8","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-38380aef-e071-45ea-88e8-8d9d341f95c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-0c66ae6c15f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03f7ffa6-0c48-48b0-bb54-f4bb7abcaec1","handle":"qa-0c66ae6c15f8","displayName":"QA 0c66ae6c15f8","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.397685821Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-398e0f9a-1d43-434c-b6a0-369394baac77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-398e0f9a-1d43-434c-b6a0-369394baac77
Content-Type: application/json

--- request body ---
{"handle":"qa-581d4f6218c3","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-398e0f9a-1d43-434c-b6a0-369394baac77
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74bf56a2-d0f6-4bfb-a52f-89b915b18a16"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-60dee1b3-4f8f-4fd2-b525-f59be184e930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60dee1b3-4f8f-4fd2-b525-f59be184e930
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e567d6fb04d","subject":"Private","message":"Just us"}

--- response: 201 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-60dee1b3-4f8f-4fd2-b525-f59be184e930
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
Location: /v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c","subject":"Private","status":"open","region":"eu","participants":["qa-581d4f6218c3","qa-0e567d6fb04d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:10.458068906Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86120a68-df0b-40e6-951c-f720453eaee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86120a68-df0b-40e6-951c-f720453eaee6
Content-Type: application/json

--- request body ---
{"handle":"qa-0c66ae6c15f8","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-86120a68-df0b-40e6-951c-f720453eaee6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03f7ffa6-0c48-48b0-bb54-f4bb7abcaec1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c
correlation: qa-2f186eef-7314-433a-baa1-967a96192e74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f186eef-7314-433a-baa1-967a96192e74
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f186eef-7314-433a-baa1-967a96192e74
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c","correlationId":"qa-2f186eef-7314-433a-baa1-967a96192e74"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c/messages
correlation: qa-18a8aa6e-fba9-41a0-b93b-ccf8b6bba369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a8aa6e-fba9-41a0-b93b-ccf8b6bba369
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a8aa6e-fba9-41a0-b93b-ccf8b6bba369
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c/messages","correlationId":"qa-18a8aa6e-fba9-41a0-b93b-ccf8b6bba369"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c/messages
correlation: qa-fb50942f-2727-4c8f-ad98-8dfdb23937f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb50942f-2727-4c8f-ad98-8dfdb23937f0
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb50942f-2727-4c8f-ad98-8dfdb23937f0
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_59f61586-c5d9-4bd5-9534-f1336c74ce2c/messages","correlationId":"qa-fb50942f-2727-4c8f-ad98-8dfdb23937f0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a05f6841-87da-4836-b6b3-cfba4d71bac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05f6841-87da-4836-b6b3-cfba4d71bac4
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a05f6841-87da-4836-b6b3-cfba4d71bac4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-ba5da5dd-a103-45a7-8e24-f7074792dd8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba5da5dd-a103-45a7-8e24-f7074792dd8e
Content-Type: application/json

--- request body ---
{"handle":"qa-0c66ae6c15f8","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba5da5dd-a103-45a7-8e24-f7074792dd8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba5da5dd-a103-45a7-8e24-f7074792dd8e"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-585fc933-945f-4a33-9476-b835062ed03b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-585fc933-945f-4a33-9476-b835062ed03b
Content-Type: application/json

--- request body ---
{"handle":"qa-0e567d6fb04d","password":"****"}

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-585fc933-945f-4a33-9476-b835062ed03b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_630d3312-c4ff-40f7-9c15-d616d721fbd1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76968180-fef7-48fa-a2a7-90a3d3245998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76968180-fef7-48fa-a2a7-90a3d3245998
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76968180-fef7-48fa-a2a7-90a3d3245998
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3f9a152a-985a-4689-a1e5-785176a83ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9a152a-985a-4689-a1e5-785176a83ba8
Content-Type: application/json

--- request body ---
{"handle":"qa-0e567d6fb04d","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f9a152a-985a-4689-a1e5-785176a83ba8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f9a152a-985a-4689-a1e5-785176a83ba8"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-387ba795-d5cb-40ae-a97a-1b580724ad7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387ba795-d5cb-40ae-a97a-1b580724ad7c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-387ba795-d5cb-40ae-a97a-1b580724ad7c
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-2cf95018-2338-4493-b95c-e0c6eca7ca36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf95018-2338-4493-b95c-e0c6eca7ca36
Content-Type: application/json

--- request body ---
{"handle":"qa-581d4f6218c3","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cf95018-2338-4493-b95c-e0c6eca7ca36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2cf95018-2338-4493-b95c-e0c6eca7ca36"}
```
