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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-953386ef-5d86-49d0-b5ee-a5c9e50132cd` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-b21c96c5-a91d-4c78-a8a0-b8e94589c246` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-7e8ca6d3-68ac-4c58-928c-183a54be4c87` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-9aa27d93-cf7a-4dc1-8058-fe007261337e` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-67be16f0-5672-451b-98fb-317c8d91c2de` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-8612c5aa-4534-48ea-90f4-232a62b82281` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-76477fbd-b6b4-4efe-8383-3a990ec75d71` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-3df3bd71-d3e4-4b1a-b34a-44901f2bda3e` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 10 | `qa-9cda2d41-5c53-4ad3-aa3f-6015d14d54bd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6cdfeeb1-918d-4fa1-946d-e7aae867f85b` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-d1d07c43-a651-4430-8ad6-0cf07b0449bd` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-917b7849-16db-4cff-99b5-5c8465b715b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-317beb70-71f4-4e0e-b445-f88ef8de1700` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-fc5bead0-c4f6-41f2-9c24-337c98dcd21e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9338dcb4-a35f-4a45-90e2-fc499dcba7a6` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-93e8deed-fe9a-4fea-be4b-dad04f9d9d33` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-953386ef-5d86-49d0-b5ee-a5c9e50132cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-953386ef-5d86-49d0-b5ee-a5c9e50132cd
Content-Type: application/json

--- request body ---
{"handle":"qa-09b06d74b235","displayName":"QA 09b06d74b235","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-953386ef-5d86-49d0-b5ee-a5c9e50132cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-09b06d74b235
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3e55ef7-de25-46f9-92fc-7108942588eb","handle":"qa-09b06d74b235","displayName":"QA 09b06d74b235","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.197720252Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b21c96c5-a91d-4c78-a8a0-b8e94589c246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b21c96c5-a91d-4c78-a8a0-b8e94589c246
Content-Type: application/json

--- request body ---
{"handle":"qa-d45de468c803","displayName":"QA d45de468c803","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b21c96c5-a91d-4c78-a8a0-b8e94589c246
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
Location: /v1/accounts/qa-d45de468c803
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5a3997c-e72d-4666-bdd6-a9258d2c0848","handle":"qa-d45de468c803","displayName":"QA d45de468c803","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.243742046Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-7e8ca6d3-68ac-4c58-928c-183a54be4c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8ca6d3-68ac-4c58-928c-183a54be4c87
Content-Type: application/json

--- request body ---
{"handle":"qa-43fff0cf8bf2","displayName":"QA 43fff0cf8bf2","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e8ca6d3-68ac-4c58-928c-183a54be4c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-43fff0cf8bf2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7bf69a11-af88-48e6-b24c-aac2af0d0613","handle":"qa-43fff0cf8bf2","displayName":"QA 43fff0cf8bf2","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.285855106Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9aa27d93-cf7a-4dc1-8058-fe007261337e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aa27d93-cf7a-4dc1-8058-fe007261337e
Content-Type: application/json

--- request body ---
{"handle":"qa-09b06d74b235","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aa27d93-cf7a-4dc1-8058-fe007261337e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3e55ef7-de25-46f9-92fc-7108942588eb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-67be16f0-5672-451b-98fb-317c8d91c2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67be16f0-5672-451b-98fb-317c8d91c2de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d45de468c803","subject":"Private","message":"Just us"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-67be16f0-5672-451b-98fb-317c8d91c2de
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
Location: /v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d","subject":"Private","status":"open","region":"eu","participants":["qa-09b06d74b235","qa-d45de468c803"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.363805736Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8612c5aa-4534-48ea-90f4-232a62b82281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8612c5aa-4534-48ea-90f4-232a62b82281
Content-Type: application/json

--- request body ---
{"handle":"qa-43fff0cf8bf2","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8612c5aa-4534-48ea-90f4-232a62b82281
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7bf69a11-af88-48e6-b24c-aac2af0d0613"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d
correlation: qa-76477fbd-b6b4-4efe-8383-3a990ec75d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76477fbd-b6b4-4efe-8383-3a990ec75d71
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76477fbd-b6b4-4efe-8383-3a990ec75d71
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d","correlationId":"qa-76477fbd-b6b4-4efe-8383-3a990ec75d71"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d/messages
correlation: qa-3df3bd71-d3e4-4b1a-b34a-44901f2bda3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df3bd71-d3e4-4b1a-b34a-44901f2bda3e
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3df3bd71-d3e4-4b1a-b34a-44901f2bda3e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d/messages","correlationId":"qa-3df3bd71-d3e4-4b1a-b34a-44901f2bda3e"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d/messages
correlation: qa-9cda2d41-5c53-4ad3-aa3f-6015d14d54bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cda2d41-5c53-4ad3-aa3f-6015d14d54bd
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cda2d41-5c53-4ad3-aa3f-6015d14d54bd
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6e2c2b6f-f2f6-411c-968b-12dc4fa6a52d/messages","correlationId":"qa-9cda2d41-5c53-4ad3-aa3f-6015d14d54bd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6cdfeeb1-918d-4fa1-946d-e7aae867f85b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cdfeeb1-918d-4fa1-946d-e7aae867f85b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6cdfeeb1-918d-4fa1-946d-e7aae867f85b
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
correlation: qa-d1d07c43-a651-4430-8ad6-0cf07b0449bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1d07c43-a651-4430-8ad6-0cf07b0449bd
Content-Type: application/json

--- request body ---
{"handle":"qa-43fff0cf8bf2","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1d07c43-a651-4430-8ad6-0cf07b0449bd
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1d07c43-a651-4430-8ad6-0cf07b0449bd"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-917b7849-16db-4cff-99b5-5c8465b715b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917b7849-16db-4cff-99b5-5c8465b715b2
Content-Type: application/json

--- request body ---
{"handle":"qa-d45de468c803","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-917b7849-16db-4cff-99b5-5c8465b715b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5a3997c-e72d-4666-bdd6-a9258d2c0848"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-317beb70-71f4-4e0e-b445-f88ef8de1700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-317beb70-71f4-4e0e-b445-f88ef8de1700
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-317beb70-71f4-4e0e-b445-f88ef8de1700
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
correlation: qa-fc5bead0-c4f6-41f2-9c24-337c98dcd21e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5bead0-c4f6-41f2-9c24-337c98dcd21e
Content-Type: application/json

--- request body ---
{"handle":"qa-d45de468c803","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc5bead0-c4f6-41f2-9c24-337c98dcd21e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc5bead0-c4f6-41f2-9c24-337c98dcd21e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9338dcb4-a35f-4a45-90e2-fc499dcba7a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9338dcb4-a35f-4a45-90e2-fc499dcba7a6
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9338dcb4-a35f-4a45-90e2-fc499dcba7a6
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
correlation: qa-93e8deed-fe9a-4fea-be4b-dad04f9d9d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e8deed-fe9a-4fea-be4b-dad04f9d9d33
Content-Type: application/json

--- request body ---
{"handle":"qa-09b06d74b235","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93e8deed-fe9a-4fea-be4b-dad04f9d9d33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93e8deed-fe9a-4fea-be4b-dad04f9d9d33"}
```
