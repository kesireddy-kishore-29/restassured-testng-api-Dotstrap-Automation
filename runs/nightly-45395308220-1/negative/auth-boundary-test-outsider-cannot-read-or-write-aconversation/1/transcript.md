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
| 1 | `POST /v1/accounts` | 201 | 357 | `qa-80d21313-741e-41d7-9f42-87d44e16df3e` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-9c0e30c0-d262-4734-9b82-e052b8e5271e` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-e3f7c185-fce8-4fcc-962b-1da89a8128f8` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-f43e05ac-8cc8-45c6-94be-c12264406301` |
| 5 | `POST /v1/conversations` | 201 | 40 | `qa-ff1e50aa-85c4-4d3a-bf85-59214440ab28` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-32353fba-5c32-4a42-b9fa-530d25c7f77b` |
| 7 | `GET /v1/conversations/{id}` | 403 | 22 | `qa-315d9794-e12f-49e6-9931-70dd29d21e79` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 12 | `qa-2a4fe3b4-7ec2-4749-ae66-854ad9942614` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 18 | `qa-91adf441-608d-4a0d-a7e1-cc1f1857dc0c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ef7d566f-49dc-42b0-955f-4ae0916eb140` |
| 11 | `POST /v1/auth/token` | 401 | 19 | `qa-3c58a349-7a2e-4b03-8485-5ae30bc32905` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-1cecfdc6-df25-4283-92ec-e18771c7c58f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-21e82565-1ce9-40cc-90f9-a680588ad86f` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-325e23a2-a367-4c65-b5a0-c1fa3ccbf1ef` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-866cf29d-24ee-4e1d-b830-a9c28fe019b1` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-989830b2-4af7-493a-bd63-c1ae179bec3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-80d21313-741e-41d7-9f42-87d44e16df3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d21313-741e-41d7-9f42-87d44e16df3e
Content-Type: application/json

--- request body ---
{"handle":"qa-5aeb799b19c3","displayName":"QA 5aeb799b19c3","password":"****","region":"eu"}

--- response: 201 in 357 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-80d21313-741e-41d7-9f42-87d44e16df3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-5aeb799b19c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a114bce7-7686-4607-a057-f6a9cbe889e1","handle":"qa-5aeb799b19c3","displayName":"QA 5aeb799b19c3","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.483777892Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9c0e30c0-d262-4734-9b82-e052b8e5271e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c0e30c0-d262-4734-9b82-e052b8e5271e
Content-Type: application/json

--- request body ---
{"handle":"qa-56c7223f0481","displayName":"QA 56c7223f0481","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c0e30c0-d262-4734-9b82-e052b8e5271e
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
Location: /v1/accounts/qa-56c7223f0481
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bee6a6a0-d6fe-4745-9841-29537f9eae68","handle":"qa-56c7223f0481","displayName":"QA 56c7223f0481","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.770309166Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e3f7c185-fce8-4fcc-962b-1da89a8128f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f7c185-fce8-4fcc-962b-1da89a8128f8
Content-Type: application/json

--- request body ---
{"handle":"qa-8346f025c4a5","displayName":"QA 8346f025c4a5","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3f7c185-fce8-4fcc-962b-1da89a8128f8
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
Location: /v1/accounts/qa-8346f025c4a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ecfdf78-be50-4c74-b559-1c33cdbc4462","handle":"qa-8346f025c4a5","displayName":"QA 8346f025c4a5","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.801705398Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f43e05ac-8cc8-45c6-94be-c12264406301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f43e05ac-8cc8-45c6-94be-c12264406301
Content-Type: application/json

--- request body ---
{"handle":"qa-5aeb799b19c3","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f43e05ac-8cc8-45c6-94be-c12264406301
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a114bce7-7686-4607-a057-f6a9cbe889e1"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ff1e50aa-85c4-4d3a-bf85-59214440ab28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1e50aa-85c4-4d3a-bf85-59214440ab28
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-56c7223f0481","subject":"Private","message":"Just us"}

--- response: 201 in 40 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff1e50aa-85c4-4d3a-bf85-59214440ab28
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
Location: /v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b","subject":"Private","status":"open","region":"eu","participants":["qa-5aeb799b19c3","qa-56c7223f0481"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:37:59.919662738Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32353fba-5c32-4a42-b9fa-530d25c7f77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32353fba-5c32-4a42-b9fa-530d25c7f77b
Content-Type: application/json

--- request body ---
{"handle":"qa-8346f025c4a5","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-32353fba-5c32-4a42-b9fa-530d25c7f77b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ecfdf78-be50-4c74-b559-1c33cdbc4462"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b
correlation: qa-315d9794-e12f-49e6-9931-70dd29d21e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315d9794-e12f-49e6-9931-70dd29d21e79
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-315d9794-e12f-49e6-9931-70dd29d21e79
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b","correlationId":"qa-315d9794-e12f-49e6-9931-70dd29d21e79"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b/messages
correlation: qa-2a4fe3b4-7ec2-4749-ae66-854ad9942614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a4fe3b4-7ec2-4749-ae66-854ad9942614
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a4fe3b4-7ec2-4749-ae66-854ad9942614
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b/messages","correlationId":"qa-2a4fe3b4-7ec2-4749-ae66-854ad9942614"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b/messages
correlation: qa-91adf441-608d-4a0d-a7e1-cc1f1857dc0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91adf441-608d-4a0d-a7e1-cc1f1857dc0c
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91adf441-608d-4a0d-a7e1-cc1f1857dc0c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_73d2c1d4-8e01-44bb-b3be-420a8877ff2b/messages","correlationId":"qa-91adf441-608d-4a0d-a7e1-cc1f1857dc0c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef7d566f-49dc-42b0-955f-4ae0916eb140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef7d566f-49dc-42b0-955f-4ae0916eb140
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef7d566f-49dc-42b0-955f-4ae0916eb140
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
correlation: qa-3c58a349-7a2e-4b03-8485-5ae30bc32905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c58a349-7a2e-4b03-8485-5ae30bc32905
Content-Type: application/json

--- request body ---
{"handle":"qa-8346f025c4a5","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c58a349-7a2e-4b03-8485-5ae30bc32905
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c58a349-7a2e-4b03-8485-5ae30bc32905"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-1cecfdc6-df25-4283-92ec-e18771c7c58f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cecfdc6-df25-4283-92ec-e18771c7c58f
Content-Type: application/json

--- request body ---
{"handle":"qa-56c7223f0481","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cecfdc6-df25-4283-92ec-e18771c7c58f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bee6a6a0-d6fe-4745-9841-29537f9eae68"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21e82565-1ce9-40cc-90f9-a680588ad86f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e82565-1ce9-40cc-90f9-a680588ad86f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21e82565-1ce9-40cc-90f9-a680588ad86f
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
correlation: qa-325e23a2-a367-4c65-b5a0-c1fa3ccbf1ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325e23a2-a367-4c65-b5a0-c1fa3ccbf1ef
Content-Type: application/json

--- request body ---
{"handle":"qa-56c7223f0481","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-325e23a2-a367-4c65-b5a0-c1fa3ccbf1ef
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-325e23a2-a367-4c65-b5a0-c1fa3ccbf1ef"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-866cf29d-24ee-4e1d-b830-a9c28fe019b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-866cf29d-24ee-4e1d-b830-a9c28fe019b1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-866cf29d-24ee-4e1d-b830-a9c28fe019b1
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
correlation: qa-989830b2-4af7-493a-bd63-c1ae179bec3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-989830b2-4af7-493a-bd63-c1ae179bec3a
Content-Type: application/json

--- request body ---
{"handle":"qa-5aeb799b19c3","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-989830b2-4af7-493a-bd63-c1ae179bec3a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-989830b2-4af7-493a-bd63-c1ae179bec3a"}
```
