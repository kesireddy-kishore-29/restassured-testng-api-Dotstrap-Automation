# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 406 | `qa-9de0ddf6-a7bb-49dc-844e-40f19081c2bc` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-2f9f658b-a46c-4227-a8f4-0da1dacddc24` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-c7526790-4224-4449-b059-ca5c9e2896c6` |
| 4 | `POST /v1/conversations` | 201 | 55 | `qa-4158b9b1-e46a-4eb7-974f-0084c39b4014` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 39 | `qa-c742387b-f1ff-4a83-949d-972cc583ebfa` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-ac78c196-e84b-48d2-b9b9-fef9d02f3dfe` |
| 7 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-47b68363-0e35-46bb-b201-38a4864b05e7` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-8061fd9a-bb94-4199-aaf6-ae4067a49466` |
| 9 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-3858c73a-0074-4698-a4f8-d91a73df650e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-35090490-3ace-4644-b18b-65290435c690` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-6589320a-8dca-4d1e-8d97-b4b8be4a2a9b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-776cb3d3-47f1-4784-8709-8253dd0426c3` |
| 13 | `POST /v1/auth/token` | 401 | 6 | `qa-15fbc18b-ca97-4dd5-a415-f98351b3fea8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9de0ddf6-a7bb-49dc-844e-40f19081c2bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de0ddf6-a7bb-49dc-844e-40f19081c2bc
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c3cdbb448","displayName":"QA c29c3cdbb448","password":"****","region":"eu"}

--- response: 201 in 406 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9de0ddf6-a7bb-49dc-844e-40f19081c2bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c29c3cdbb448
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65a84b94-6fad-4a32-9407-efaf9f28c6ab","handle":"qa-c29c3cdbb448","displayName":"QA c29c3cdbb448","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.402491189Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f9f658b-a46c-4227-a8f4-0da1dacddc24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f9f658b-a46c-4227-a8f4-0da1dacddc24
Content-Type: application/json

--- request body ---
{"handle":"qa-d8585a317942","displayName":"QA d8585a317942","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f9f658b-a46c-4227-a8f4-0da1dacddc24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-d8585a317942
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d72e5c8-0e5f-4187-bdb9-ac503c06804e","handle":"qa-d8585a317942","displayName":"QA d8585a317942","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.745868918Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c7526790-4224-4449-b059-ca5c9e2896c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7526790-4224-4449-b059-ca5c9e2896c6
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c3cdbb448","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7526790-4224-4449-b059-ca5c9e2896c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65a84b94-6fad-4a32-9407-efaf9f28c6ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4158b9b1-e46a-4eb7-974f-0084c39b4014

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4158b9b1-e46a-4eb7-974f-0084c39b4014
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d8585a317942","subject":"Updates","message":"First"}

--- response: 201 in 55 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4158b9b1-e46a-4eb7-974f-0084c39b4014
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
Location: /v1/conversations/cnv_7aa6bbf4-cee3-466a-898e-d1be33def080
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_7aa6bbf4-cee3-466a-898e-d1be33def080","subject":"Updates","status":"open","region":"eu","participants":["qa-c29c3cdbb448","qa-d8585a317942"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.871766052Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_7aa6bbf4-cee3-466a-898e-d1be33def080/messages
correlation: qa-c742387b-f1ff-4a83-949d-972cc583ebfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c742387b-f1ff-4a83-949d-972cc583ebfa
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c742387b-f1ff-4a83-949d-972cc583ebfa
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
Content-Length: 197

{"id":"msg_bf1c71a9-f55c-4410-aa33-dd7a9981e008","conversationId":"cnv_7aa6bbf4-cee3-466a-898e-d1be33def080","sender":"qa-c29c3cdbb448","body":"Second","createdAt":"2026-11-21T09:57:09.974272971Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac78c196-e84b-48d2-b9b9-fef9d02f3dfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac78c196-e84b-48d2-b9b9-fef9d02f3dfe
Content-Type: application/json

--- request body ---
{"handle":"qa-d8585a317942","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac78c196-e84b-48d2-b9b9-fef9d02f3dfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d72e5c8-0e5f-4187-bdb9-ac503c06804e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_7aa6bbf4-cee3-466a-898e-d1be33def080
correlation: qa-47b68363-0e35-46bb-b201-38a4864b05e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b68363-0e35-46bb-b201-38a4864b05e7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b68363-0e35-46bb-b201-38a4864b05e7
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_7aa6bbf4-cee3-466a-898e-d1be33def080","subject":"Updates","status":"open","region":"eu","participants":["qa-c29c3cdbb448","qa-d8585a317942"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-21T09:57:09.871766052Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_7aa6bbf4-cee3-466a-898e-d1be33def080/read
correlation: qa-8061fd9a-bb94-4199-aaf6-ae4067a49466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8061fd9a-bb94-4199-aaf6-ae4067a49466
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8061fd9a-bb94-4199-aaf6-ae4067a49466
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
Content-Length: 77

{"conversationId":"cnv_7aa6bbf4-cee3-466a-898e-d1be33def080","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_7aa6bbf4-cee3-466a-898e-d1be33def080
correlation: qa-3858c73a-0074-4698-a4f8-d91a73df650e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3858c73a-0074-4698-a4f8-d91a73df650e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3858c73a-0074-4698-a4f8-d91a73df650e
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_7aa6bbf4-cee3-466a-898e-d1be33def080","subject":"Updates","status":"open","region":"eu","participants":["qa-c29c3cdbb448","qa-d8585a317942"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.871766052Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35090490-3ace-4644-b18b-65290435c690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35090490-3ace-4644-b18b-65290435c690
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35090490-3ace-4644-b18b-65290435c690
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-6589320a-8dca-4d1e-8d97-b4b8be4a2a9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6589320a-8dca-4d1e-8d97-b4b8be4a2a9b
Content-Type: application/json

--- request body ---
{"handle":"qa-d8585a317942","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6589320a-8dca-4d1e-8d97-b4b8be4a2a9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6589320a-8dca-4d1e-8d97-b4b8be4a2a9b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-776cb3d3-47f1-4784-8709-8253dd0426c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776cb3d3-47f1-4784-8709-8253dd0426c3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-776cb3d3-47f1-4784-8709-8253dd0426c3
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

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-15fbc18b-ca97-4dd5-a415-f98351b3fea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15fbc18b-ca97-4dd5-a415-f98351b3fea8
Content-Type: application/json

--- request body ---
{"handle":"qa-c29c3cdbb448","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15fbc18b-ca97-4dd5-a415-f98351b3fea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15fbc18b-ca97-4dd5-a415-f98351b3fea8"}
```
