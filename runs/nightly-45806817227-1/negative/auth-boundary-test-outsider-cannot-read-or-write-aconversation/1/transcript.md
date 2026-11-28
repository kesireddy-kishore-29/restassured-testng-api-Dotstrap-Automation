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
| 1 | `POST /v1/accounts` | 201 | 433 | `qa-1a93b1cb-e909-4af6-88ba-dc26b1a8558a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-7d8560c1-3fbe-41c9-bd14-d435c15e9264` |
| 3 | `POST /v1/accounts` | 201 | 57 | `qa-127135e9-ea7c-4fb2-a2d5-79253b90dadc` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-ca0670a9-a345-4593-b852-63dcae64e81c` |
| 5 | `POST /v1/conversations` | 201 | 36 | `qa-86741d0c-de1b-45d6-8c13-f83145ae89f5` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-7d48ee89-3c93-4aca-985e-8bdbe9f23d58` |
| 7 | `GET /v1/conversations/{id}` | 403 | 28 | `qa-ba5981e4-c8cc-46d6-99be-b205da94a1ed` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-759a61cf-189f-4a0e-8794-bc7bcddf39d4` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 13 | `qa-874f8e3c-ca5f-47a2-bec8-dd70dcec2899` |
| 10 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-51722ccd-057e-488a-8f42-1342ce49821e` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-c1eb3e12-aa1e-40a3-943c-3d9486bd3bb9` |
| 12 | `POST /v1/auth/token` | 200 | 9 | `qa-bd38701a-eff4-4b73-8b61-801ee75e9b17` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-2c0faacc-8b4e-424e-8a05-5be8e7db986c` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-cf8da37a-bb4b-4443-a341-d92372bb01b8` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f2ccfc38-4b05-44cb-acb4-51505ec8fc12` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-8e840991-ffe5-48f6-8f2e-6217e7d33076` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a93b1cb-e909-4af6-88ba-dc26b1a8558a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a93b1cb-e909-4af6-88ba-dc26b1a8558a
Content-Type: application/json

--- request body ---
{"handle":"qa-5d9980c262fe","displayName":"QA 5d9980c262fe","password":"****","region":"eu"}

--- response: 201 in 433 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a93b1cb-e909-4af6-88ba-dc26b1a8558a
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
Location: /v1/accounts/qa-5d9980c262fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_790cdc08-2be0-4010-9771-c051f86606d8","handle":"qa-5d9980c262fe","displayName":"QA 5d9980c262fe","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.809056030Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d8560c1-3fbe-41c9-bd14-d435c15e9264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d8560c1-3fbe-41c9-bd14-d435c15e9264
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9a6f5e68f8","displayName":"QA 1f9a6f5e68f8","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d8560c1-3fbe-41c9-bd14-d435c15e9264
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
Location: /v1/accounts/qa-1f9a6f5e68f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2e25966-dcad-4083-97a8-201814930102","handle":"qa-1f9a6f5e68f8","displayName":"QA 1f9a6f5e68f8","region":"eu","role":"user","createdAt":"2026-11-26T11:02:35.160713238Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-127135e9-ea7c-4fb2-a2d5-79253b90dadc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127135e9-ea7c-4fb2-a2d5-79253b90dadc
Content-Type: application/json

--- request body ---
{"handle":"qa-81031ad5b67c","displayName":"QA 81031ad5b67c","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-127135e9-ea7c-4fb2-a2d5-79253b90dadc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-81031ad5b67c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82209746-6e7f-4484-ad6c-2281e744e134","handle":"qa-81031ad5b67c","displayName":"QA 81031ad5b67c","region":"eu","role":"user","createdAt":"2026-11-26T11:02:35.226360666Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ca0670a9-a345-4593-b852-63dcae64e81c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca0670a9-a345-4593-b852-63dcae64e81c
Content-Type: application/json

--- request body ---
{"handle":"qa-5d9980c262fe","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca0670a9-a345-4593-b852-63dcae64e81c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_790cdc08-2be0-4010-9771-c051f86606d8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-86741d0c-de1b-45d6-8c13-f83145ae89f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86741d0c-de1b-45d6-8c13-f83145ae89f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f9a6f5e68f8","subject":"Private","message":"Just us"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-86741d0c-de1b-45d6-8c13-f83145ae89f5
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
Location: /v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_83693b94-5597-4d5e-bf45-038561c6cea4","subject":"Private","status":"open","region":"eu","participants":["qa-5d9980c262fe","qa-1f9a6f5e68f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:35.360225204Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d48ee89-3c93-4aca-985e-8bdbe9f23d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d48ee89-3c93-4aca-985e-8bdbe9f23d58
Content-Type: application/json

--- request body ---
{"handle":"qa-81031ad5b67c","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d48ee89-3c93-4aca-985e-8bdbe9f23d58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82209746-6e7f-4484-ad6c-2281e744e134"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4
correlation: qa-ba5981e4-c8cc-46d6-99be-b205da94a1ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba5981e4-c8cc-46d6-99be-b205da94a1ed
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba5981e4-c8cc-46d6-99be-b205da94a1ed
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4","correlationId":"qa-ba5981e4-c8cc-46d6-99be-b205da94a1ed"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4/messages
correlation: qa-759a61cf-189f-4a0e-8794-bc7bcddf39d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-759a61cf-189f-4a0e-8794-bc7bcddf39d4
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-759a61cf-189f-4a0e-8794-bc7bcddf39d4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4/messages","correlationId":"qa-759a61cf-189f-4a0e-8794-bc7bcddf39d4"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4/messages
correlation: qa-874f8e3c-ca5f-47a2-bec8-dd70dcec2899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-874f8e3c-ca5f-47a2-bec8-dd70dcec2899
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-874f8e3c-ca5f-47a2-bec8-dd70dcec2899
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_83693b94-5597-4d5e-bf45-038561c6cea4/messages","correlationId":"qa-874f8e3c-ca5f-47a2-bec8-dd70dcec2899"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51722ccd-057e-488a-8f42-1342ce49821e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51722ccd-057e-488a-8f42-1342ce49821e
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51722ccd-057e-488a-8f42-1342ce49821e
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
correlation: qa-c1eb3e12-aa1e-40a3-943c-3d9486bd3bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1eb3e12-aa1e-40a3-943c-3d9486bd3bb9
Content-Type: application/json

--- request body ---
{"handle":"qa-81031ad5b67c","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1eb3e12-aa1e-40a3-943c-3d9486bd3bb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1eb3e12-aa1e-40a3-943c-3d9486bd3bb9"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-bd38701a-eff4-4b73-8b61-801ee75e9b17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd38701a-eff4-4b73-8b61-801ee75e9b17
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9a6f5e68f8","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd38701a-eff4-4b73-8b61-801ee75e9b17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2e25966-dcad-4083-97a8-201814930102"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c0faacc-8b4e-424e-8a05-5be8e7db986c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c0faacc-8b4e-424e-8a05-5be8e7db986c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c0faacc-8b4e-424e-8a05-5be8e7db986c
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
correlation: qa-cf8da37a-bb4b-4443-a341-d92372bb01b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf8da37a-bb4b-4443-a341-d92372bb01b8
Content-Type: application/json

--- request body ---
{"handle":"qa-1f9a6f5e68f8","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf8da37a-bb4b-4443-a341-d92372bb01b8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf8da37a-bb4b-4443-a341-d92372bb01b8"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2ccfc38-4b05-44cb-acb4-51505ec8fc12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ccfc38-4b05-44cb-acb4-51505ec8fc12
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2ccfc38-4b05-44cb-acb4-51505ec8fc12
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
correlation: qa-8e840991-ffe5-48f6-8f2e-6217e7d33076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e840991-ffe5-48f6-8f2e-6217e7d33076
Content-Type: application/json

--- request body ---
{"handle":"qa-5d9980c262fe","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e840991-ffe5-48f6-8f2e-6217e7d33076
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e840991-ffe5-48f6-8f2e-6217e7d33076"}
```
