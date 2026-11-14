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
| 1 | `POST /v1/accounts` | 201 | 459 | `qa-090a2396-b963-4be1-b43e-bfda297bb05a` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-02f367f0-a3e4-41d0-84bd-50e302eb81e1` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-e22b5fc0-87b8-45e6-9d86-53f8044da880` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-fbf60292-7231-43e2-994f-db15aea0e1c8` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-c9b33a58-7268-41d0-90fa-46d6ba96cc3e` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-a65182e7-90b2-4124-a126-7eb1a41db10f` |
| 7 | `GET /v1/conversations/{id}` | 200 | 23 | `qa-237e3a6a-0be2-4e5c-8b06-fa902c72882c` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 22 | `qa-fd67ba2b-9dec-4ee7-bcec-ad8aa8b69299` |
| 9 | `GET /v1/conversations/{id}` | 200 | 19 | `qa-eb158c54-e023-4fbc-bc1a-1d93cb5e668e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4f2f23d5-af3c-4fdb-90be-586b51434590` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-93d156ad-616d-4dd1-8dec-fd113d09252e` |
| 12 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3c9ac956-195a-48f8-afe3-802cd62bddf2` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-6f16642c-b548-4e0e-b0cf-ccbbd84dc56a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-090a2396-b963-4be1-b43e-bfda297bb05a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090a2396-b963-4be1-b43e-bfda297bb05a
Content-Type: application/json

--- request body ---
{"handle":"qa-ba2e568a775f","displayName":"QA ba2e568a775f","password":"****","region":"eu"}

--- response: 201 in 459 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-090a2396-b963-4be1-b43e-bfda297bb05a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-ba2e568a775f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1be64a98-11c4-4728-90be-3885e9fba75d","handle":"qa-ba2e568a775f","displayName":"QA ba2e568a775f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.162951369Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-02f367f0-a3e4-41d0-84bd-50e302eb81e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02f367f0-a3e4-41d0-84bd-50e302eb81e1
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbfa2c1432","displayName":"QA 25bbfa2c1432","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-02f367f0-a3e4-41d0-84bd-50e302eb81e1
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
Location: /v1/accounts/qa-25bbfa2c1432
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c65d5478-d79b-46c3-8543-970efebc4b48","handle":"qa-25bbfa2c1432","displayName":"QA 25bbfa2c1432","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.578356954Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e22b5fc0-87b8-45e6-9d86-53f8044da880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e22b5fc0-87b8-45e6-9d86-53f8044da880
Content-Type: application/json

--- request body ---
{"handle":"qa-ba2e568a775f","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e22b5fc0-87b8-45e6-9d86-53f8044da880
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1be64a98-11c4-4728-90be-3885e9fba75d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fbf60292-7231-43e2-994f-db15aea0e1c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbf60292-7231-43e2-994f-db15aea0e1c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25bbfa2c1432","subject":"Updates","message":"First"}

--- response: 201 in 69 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbf60292-7231-43e2-994f-db15aea0e1c8
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
Location: /v1/conversations/cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6","subject":"Updates","status":"open","region":"eu","participants":["qa-ba2e568a775f","qa-25bbfa2c1432"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:31.727687611Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6/messages
correlation: qa-c9b33a58-7268-41d0-90fa-46d6ba96cc3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9b33a58-7268-41d0-90fa-46d6ba96cc3e
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9b33a58-7268-41d0-90fa-46d6ba96cc3e
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

{"id":"msg_0638475b-a13b-42a9-8e2d-1cd8a5869844","conversationId":"cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6","sender":"qa-ba2e568a775f","body":"Second","createdAt":"2026-11-11T09:34:31.902496233Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a65182e7-90b2-4124-a126-7eb1a41db10f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a65182e7-90b2-4124-a126-7eb1a41db10f
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbfa2c1432","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a65182e7-90b2-4124-a126-7eb1a41db10f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c65d5478-d79b-46c3-8543-970efebc4b48"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6
correlation: qa-237e3a6a-0be2-4e5c-8b06-fa902c72882c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-237e3a6a-0be2-4e5c-8b06-fa902c72882c
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-237e3a6a-0be2-4e5c-8b06-fa902c72882c
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

{"id":"cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6","subject":"Updates","status":"open","region":"eu","participants":["qa-ba2e568a775f","qa-25bbfa2c1432"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-11T09:34:31.727687611Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6/read
correlation: qa-fd67ba2b-9dec-4ee7-bcec-ad8aa8b69299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd67ba2b-9dec-4ee7-bcec-ad8aa8b69299
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd67ba2b-9dec-4ee7-bcec-ad8aa8b69299
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

{"conversationId":"cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6
correlation: qa-eb158c54-e023-4fbc-bc1a-1d93cb5e668e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb158c54-e023-4fbc-bc1a-1d93cb5e668e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb158c54-e023-4fbc-bc1a-1d93cb5e668e
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

{"id":"cnv_e27ae03e-70b1-4060-904f-889a2cec6bf6","subject":"Updates","status":"open","region":"eu","participants":["qa-ba2e568a775f","qa-25bbfa2c1432"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-11T09:34:31.727687611Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f2f23d5-af3c-4fdb-90be-586b51434590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2f23d5-af3c-4fdb-90be-586b51434590
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f2f23d5-af3c-4fdb-90be-586b51434590
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
correlation: qa-93d156ad-616d-4dd1-8dec-fd113d09252e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d156ad-616d-4dd1-8dec-fd113d09252e
Content-Type: application/json

--- request body ---
{"handle":"qa-25bbfa2c1432","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93d156ad-616d-4dd1-8dec-fd113d09252e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93d156ad-616d-4dd1-8dec-fd113d09252e"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c9ac956-195a-48f8-afe3-802cd62bddf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c9ac956-195a-48f8-afe3-802cd62bddf2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c9ac956-195a-48f8-afe3-802cd62bddf2
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
correlation: qa-6f16642c-b548-4e0e-b0cf-ccbbd84dc56a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f16642c-b548-4e0e-b0cf-ccbbd84dc56a
Content-Type: application/json

--- request body ---
{"handle":"qa-ba2e568a775f","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f16642c-b548-4e0e-b0cf-ccbbd84dc56a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f16642c-b548-4e0e-b0cf-ccbbd84dc56a"}
```
