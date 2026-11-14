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
| 1 | `POST /v1/accounts` | 201 | 344 | `qa-52bb0ba1-593c-4f58-89a5-726ad3d3a6fa` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-a2f0d61a-c4ee-433e-80cd-644dbbfb22a6` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-b3b6f01f-974a-4301-8267-6c0181ff9eb5` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-7d799468-cfa4-495f-b5b4-4ace8993f045` |
| 5 | `POST /v1/auth/token` | 200 | 19 | `qa-84d0c967-2c70-44b2-a940-bd5e96fe9632` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-db430e94-6a2e-4d86-9a10-940385b04caa` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-116b9f13-7893-46ca-b47b-bda3b296fb6e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-06e6d1c6-20c2-4c9c-b19c-3a868da56578` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-1217b020-28c1-49ca-9846-25c5558aae39` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8e28c326-9c38-402b-be31-59d6c39d0726` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-4e5377ec-413f-46ae-aa46-1e409a6181b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-52bb0ba1-593c-4f58-89a5-726ad3d3a6fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bb0ba1-593c-4f58-89a5-726ad3d3a6fa
Content-Type: application/json

--- request body ---
{"handle":"qa-4a1949b9f500","displayName":"QA 4a1949b9f500","password":"****","region":"eu"}

--- response: 201 in 344 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-52bb0ba1-593c-4f58-89a5-726ad3d3a6fa
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
Location: /v1/accounts/qa-4a1949b9f500
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9daad2be-40a2-454b-97d3-905630256a2e","handle":"qa-4a1949b9f500","displayName":"QA 4a1949b9f500","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.157318186Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2f0d61a-c4ee-433e-80cd-644dbbfb22a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2f0d61a-c4ee-433e-80cd-644dbbfb22a6
Content-Type: application/json

--- request body ---
{"handle":"qa-df22d0e6b4d7","displayName":"QA df22d0e6b4d7","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2f0d61a-c4ee-433e-80cd-644dbbfb22a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-df22d0e6b4d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8828d6ab-29f8-426e-a881-b5d282c4ddcd","handle":"qa-df22d0e6b4d7","displayName":"QA df22d0e6b4d7","region":"eu","role":"user","createdAt":"2026-11-08T09:09:04.459754991Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3b6f01f-974a-4301-8267-6c0181ff9eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3b6f01f-974a-4301-8267-6c0181ff9eb5
Content-Type: application/json

--- request body ---
{"handle":"qa-4a1949b9f500","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3b6f01f-974a-4301-8267-6c0181ff9eb5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9daad2be-40a2-454b-97d3-905630256a2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7d799468-cfa4-495f-b5b4-4ace8993f045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d799468-cfa4-495f-b5b4-4ace8993f045
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-df22d0e6b4d7","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 48 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d799468-cfa4-495f-b5b4-4ace8993f045
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
Location: /v1/conversations/cnv_eca787e8-790b-40af-970c-78719b2db385
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_eca787e8-790b-40af-970c-78719b2db385","subject":"Lunch?","status":"open","region":"eu","participants":["qa-4a1949b9f500","qa-df22d0e6b4d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:04.593230513Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-84d0c967-2c70-44b2-a940-bd5e96fe9632

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84d0c967-2c70-44b2-a940-bd5e96fe9632
Content-Type: application/json

--- request body ---
{"handle":"qa-df22d0e6b4d7","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-84d0c967-2c70-44b2-a940-bd5e96fe9632
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8828d6ab-29f8-426e-a881-b5d282c4ddcd"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_eca787e8-790b-40af-970c-78719b2db385/messages
correlation: qa-db430e94-6a2e-4d86-9a10-940385b04caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db430e94-6a2e-4d86-9a10-940385b04caa
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-db430e94-6a2e-4d86-9a10-940385b04caa
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

{"id":"msg_f970bb8c-21a6-4107-abfc-f47c6227117a","conversationId":"cnv_eca787e8-790b-40af-970c-78719b2db385","sender":"qa-df22d0e6b4d7","body":"Friday works","createdAt":"2026-11-08T09:09:04.695698343Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_eca787e8-790b-40af-970c-78719b2db385/messages
correlation: qa-116b9f13-7893-46ca-b47b-bda3b296fb6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-116b9f13-7893-46ca-b47b-bda3b296fb6e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-116b9f13-7893-46ca-b47b-bda3b296fb6e
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

{"items":[{"id":"msg_05c9846b-1838-4a19-abdd-9f40305fbceb","conversationId":"cnv_eca787e8-790b-40af-970c-78719b2db385","sender":"qa-4a1949b9f500","body":"Free on Friday?","createdAt":"2026-11-08T09:09:04.593477260Z"},{"id":"msg_f970bb8c-21a6-4107-abfc-f47c6227117a","conversationId":"cnv_eca787e8-790b-40af-970c-78719b2db385","sender":"qa-df22d0e6b4d7","body":"Friday works","createdAt":"2026-11-08T09:09:04.695698343Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06e6d1c6-20c2-4c9c-b19c-3a868da56578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06e6d1c6-20c2-4c9c-b19c-3a868da56578
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06e6d1c6-20c2-4c9c-b19c-3a868da56578
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
correlation: qa-1217b020-28c1-49ca-9846-25c5558aae39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1217b020-28c1-49ca-9846-25c5558aae39
Content-Type: application/json

--- request body ---
{"handle":"qa-df22d0e6b4d7","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1217b020-28c1-49ca-9846-25c5558aae39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1217b020-28c1-49ca-9846-25c5558aae39"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e28c326-9c38-402b-be31-59d6c39d0726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e28c326-9c38-402b-be31-59d6c39d0726
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e28c326-9c38-402b-be31-59d6c39d0726
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
correlation: qa-4e5377ec-413f-46ae-aa46-1e409a6181b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e5377ec-413f-46ae-aa46-1e409a6181b7
Content-Type: application/json

--- request body ---
{"handle":"qa-4a1949b9f500","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e5377ec-413f-46ae-aa46-1e409a6181b7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e5377ec-413f-46ae-aa46-1e409a6181b7"}
```
