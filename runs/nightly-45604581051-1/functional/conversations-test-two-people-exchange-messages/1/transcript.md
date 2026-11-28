# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 459 | `qa-4b750752-4ba7-4d42-bc79-3ac80b4e7a92` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-f5d2243c-d1b0-4bfc-b3f3-af82c0be2dc8` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-582034e9-2170-4330-9168-92c2758c7b6e` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-cfb37f3c-459c-41b0-b236-27910f4b4ab8` |
| 5 | `POST /v1/auth/token` | 200 | 26 | `qa-08a2a550-4d8a-43e9-b46e-a49c9f12c944` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 37 | `qa-9121a0b7-072d-436f-bfe0-fc4fcd3183bc` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 23 | `qa-3a28d48d-86e8-4894-ad0e-02c3832ee23b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-166c5696-fd65-4dba-af9a-12a8a74cf707` |
| 9 | `POST /v1/auth/token` | 401 | 45 | `qa-81ed1081-896e-4f1e-9450-64f95c851643` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3b51f2ca-e047-410f-9fdd-6007ce83e1c5` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-0cab6bff-1bf2-421f-a875-9db641740365` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b750752-4ba7-4d42-bc79-3ac80b4e7a92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b750752-4ba7-4d42-bc79-3ac80b4e7a92
Content-Type: application/json

--- request body ---
{"handle":"qa-aa198cc11102","displayName":"QA aa198cc11102","password":"****","region":"eu"}

--- response: 201 in 459 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b750752-4ba7-4d42-bc79-3ac80b4e7a92
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
Location: /v1/accounts/qa-aa198cc11102
X-Served-Region: eu
Content-Length: 181

{"id":"acc_470f935b-d063-46c8-8458-7fdbd930ccf7","handle":"qa-aa198cc11102","displayName":"QA aa198cc11102","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.371260700Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5d2243c-d1b0-4bfc-b3f3-af82c0be2dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d2243c-d1b0-4bfc-b3f3-af82c0be2dc8
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1521d630b6","displayName":"QA 2e1521d630b6","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5d2243c-d1b0-4bfc-b3f3-af82c0be2dc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-2e1521d630b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83091495-6bae-4b46-8259-3edfc2624089","handle":"qa-2e1521d630b6","displayName":"QA 2e1521d630b6","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.823855665Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-582034e9-2170-4330-9168-92c2758c7b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-582034e9-2170-4330-9168-92c2758c7b6e
Content-Type: application/json

--- request body ---
{"handle":"qa-aa198cc11102","password":"****"}

--- response: 200 in 48 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-582034e9-2170-4330-9168-92c2758c7b6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_470f935b-d063-46c8-8458-7fdbd930ccf7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cfb37f3c-459c-41b0-b236-27910f4b4ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb37f3c-459c-41b0-b236-27910f4b4ab8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2e1521d630b6","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 59 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfb37f3c-459c-41b0-b236-27910f4b4ab8
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
Location: /v1/conversations/cnv_272fd214-f437-493d-b73b-61bd50eb39f4
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_272fd214-f437-493d-b73b-61bd50eb39f4","subject":"Lunch?","status":"open","region":"eu","participants":["qa-aa198cc11102","qa-2e1521d630b6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:53.983935649Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-08a2a550-4d8a-43e9-b46e-a49c9f12c944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a2a550-4d8a-43e9-b46e-a49c9f12c944
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1521d630b6","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a2a550-4d8a-43e9-b46e-a49c9f12c944
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83091495-6bae-4b46-8259-3edfc2624089"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_272fd214-f437-493d-b73b-61bd50eb39f4/messages
correlation: qa-9121a0b7-072d-436f-bfe0-fc4fcd3183bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9121a0b7-072d-436f-bfe0-fc4fcd3183bc
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9121a0b7-072d-436f-bfe0-fc4fcd3183bc
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
Content-Length: 203

{"id":"msg_32e90c2c-31e1-40ed-92c6-b2650230afe3","conversationId":"cnv_272fd214-f437-493d-b73b-61bd50eb39f4","sender":"qa-2e1521d630b6","body":"Friday works","createdAt":"2026-11-25T11:27:54.149644429Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_272fd214-f437-493d-b73b-61bd50eb39f4/messages
correlation: qa-3a28d48d-86e8-4894-ad0e-02c3832ee23b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a28d48d-86e8-4894-ad0e-02c3832ee23b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a28d48d-86e8-4894-ad0e-02c3832ee23b
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
Content-Length: 432

{"items":[{"id":"msg_0bd268c0-1f50-4381-b307-07b5b48c378b","conversationId":"cnv_272fd214-f437-493d-b73b-61bd50eb39f4","sender":"qa-aa198cc11102","body":"Free on Friday?","createdAt":"2026-11-25T11:27:53.984210874Z"},{"id":"msg_32e90c2c-31e1-40ed-92c6-b2650230afe3","conversationId":"cnv_272fd214-f437-493d-b73b-61bd50eb39f4","sender":"qa-2e1521d630b6","body":"Friday works","createdAt":"2026-11-25T11:27:54.149644429Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-166c5696-fd65-4dba-af9a-12a8a74cf707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166c5696-fd65-4dba-af9a-12a8a74cf707
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-166c5696-fd65-4dba-af9a-12a8a74cf707
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-81ed1081-896e-4f1e-9450-64f95c851643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ed1081-896e-4f1e-9450-64f95c851643
Content-Type: application/json

--- request body ---
{"handle":"qa-2e1521d630b6","password":"****"}

--- response: 401 in 45 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81ed1081-896e-4f1e-9450-64f95c851643
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81ed1081-896e-4f1e-9450-64f95c851643"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b51f2ca-e047-410f-9fdd-6007ce83e1c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b51f2ca-e047-410f-9fdd-6007ce83e1c5
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b51f2ca-e047-410f-9fdd-6007ce83e1c5
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
correlation: qa-0cab6bff-1bf2-421f-a875-9db641740365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cab6bff-1bf2-421f-a875-9db641740365
Content-Type: application/json

--- request body ---
{"handle":"qa-aa198cc11102","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cab6bff-1bf2-421f-a875-9db641740365
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0cab6bff-1bf2-421f-a875-9db641740365"}
```
