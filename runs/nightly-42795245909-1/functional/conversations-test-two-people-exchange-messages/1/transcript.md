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
| 1 | `POST /v1/accounts` | 201 | 468 | `qa-e0be0b25-299f-4fe1-8d03-f9b257222751` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-9a43335e-4af4-474b-a738-2bfe160da183` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-b2be840c-a773-46c0-968b-45a6e8441225` |
| 4 | `POST /v1/conversations` | 201 | 60 | `qa-782deb2d-a477-4d26-9f05-5c7b8fb84f6f` |
| 5 | `POST /v1/auth/token` | 200 | 33 | `qa-62550e2d-300e-42a0-a09e-f21524e11611` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-cf5e4802-a531-45c8-ba20-713090b6a67d` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 27 | `qa-6cb0f070-0179-4a65-afa0-c0d3800f9e55` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1153d346-73e9-4390-a5ab-091604a7d599` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-d88812fe-b9d6-4255-82b9-cb9c804c2be2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c56c178f-ae2b-4a9b-9624-f9de8b1fb46a` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-97e8cedc-bb65-4bb1-81f8-224f8bfb87b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e0be0b25-299f-4fe1-8d03-f9b257222751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0be0b25-299f-4fe1-8d03-f9b257222751
Content-Type: application/json

--- request body ---
{"handle":"qa-df1a0689944d","displayName":"QA df1a0689944d","password":"****","region":"eu"}

--- response: 201 in 468 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0be0b25-299f-4fe1-8d03-f9b257222751
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
Location: /v1/accounts/qa-df1a0689944d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_352f5175-2ff3-4520-9caa-b0251ba5a54f","handle":"qa-df1a0689944d","displayName":"QA df1a0689944d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.175028615Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a43335e-4af4-474b-a738-2bfe160da183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a43335e-4af4-474b-a738-2bfe160da183
Content-Type: application/json

--- request body ---
{"handle":"qa-886bc3a61ecd","displayName":"QA 886bc3a61ecd","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a43335e-4af4-474b-a738-2bfe160da183
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
Location: /v1/accounts/qa-886bc3a61ecd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9427662-4a33-486a-a390-ff8287fa4869","handle":"qa-886bc3a61ecd","displayName":"QA 886bc3a61ecd","region":"eu","role":"user","createdAt":"2026-11-10T09:59:38.647269935Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2be840c-a773-46c0-968b-45a6e8441225

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2be840c-a773-46c0-968b-45a6e8441225
Content-Type: application/json

--- request body ---
{"handle":"qa-df1a0689944d","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2be840c-a773-46c0-968b-45a6e8441225
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_352f5175-2ff3-4520-9caa-b0251ba5a54f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-782deb2d-a477-4d26-9f05-5c7b8fb84f6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782deb2d-a477-4d26-9f05-5c7b8fb84f6f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-886bc3a61ecd","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 60 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-782deb2d-a477-4d26-9f05-5c7b8fb84f6f
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
Location: /v1/conversations/cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf","subject":"Lunch?","status":"open","region":"eu","participants":["qa-df1a0689944d","qa-886bc3a61ecd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:38.819299031Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-62550e2d-300e-42a0-a09e-f21524e11611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62550e2d-300e-42a0-a09e-f21524e11611
Content-Type: application/json

--- request body ---
{"handle":"qa-886bc3a61ecd","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-62550e2d-300e-42a0-a09e-f21524e11611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9427662-4a33-486a-a390-ff8287fa4869"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf/messages
correlation: qa-cf5e4802-a531-45c8-ba20-713090b6a67d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf5e4802-a531-45c8-ba20-713090b6a67d
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf5e4802-a531-45c8-ba20-713090b6a67d
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

{"id":"msg_620bf425-a35d-4b91-b600-44b2c325bc43","conversationId":"cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf","sender":"qa-886bc3a61ecd","body":"Friday works","createdAt":"2026-11-10T09:59:38.984330208Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf/messages
correlation: qa-6cb0f070-0179-4a65-afa0-c0d3800f9e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb0f070-0179-4a65-afa0-c0d3800f9e55
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cb0f070-0179-4a65-afa0-c0d3800f9e55
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

{"items":[{"id":"msg_7964785c-2e3e-45b6-8945-543b0bf82af5","conversationId":"cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf","sender":"qa-df1a0689944d","body":"Free on Friday?","createdAt":"2026-11-10T09:59:38.819575998Z"},{"id":"msg_620bf425-a35d-4b91-b600-44b2c325bc43","conversationId":"cnv_994bb3e8-6a62-4abb-a5b4-7a08c4306acf","sender":"qa-886bc3a61ecd","body":"Friday works","createdAt":"2026-11-10T09:59:38.984330208Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1153d346-73e9-4390-a5ab-091604a7d599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1153d346-73e9-4390-a5ab-091604a7d599
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1153d346-73e9-4390-a5ab-091604a7d599
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
correlation: qa-d88812fe-b9d6-4255-82b9-cb9c804c2be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88812fe-b9d6-4255-82b9-cb9c804c2be2
Content-Type: application/json

--- request body ---
{"handle":"qa-886bc3a61ecd","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d88812fe-b9d6-4255-82b9-cb9c804c2be2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d88812fe-b9d6-4255-82b9-cb9c804c2be2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c56c178f-ae2b-4a9b-9624-f9de8b1fb46a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56c178f-ae2b-4a9b-9624-f9de8b1fb46a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c56c178f-ae2b-4a9b-9624-f9de8b1fb46a
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
correlation: qa-97e8cedc-bb65-4bb1-81f8-224f8bfb87b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e8cedc-bb65-4bb1-81f8-224f8bfb87b0
Content-Type: application/json

--- request body ---
{"handle":"qa-df1a0689944d","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97e8cedc-bb65-4bb1-81f8-224f8bfb87b0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97e8cedc-bb65-4bb1-81f8-224f8bfb87b0"}
```
