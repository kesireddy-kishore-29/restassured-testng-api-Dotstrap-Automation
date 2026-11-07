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
| 1 | `POST /v1/accounts` | 201 | 396 | `qa-5848b81f-27f5-401f-b5aa-06528587a241` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-5afb9028-7e09-4978-b2ec-44216a52f22a` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-758e7914-3c6c-4808-a47a-70b2ccd6c459` |
| 4 | `POST /v1/conversations` | 201 | 70 | `qa-71ae94d1-be19-4cc6-a2af-5d967aff3a9c` |
| 5 | `POST /v1/auth/token` | 200 | 11 | `qa-1753f8b2-f413-481b-ac93-d7961c810f7a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-92e10cc7-8fab-4c83-a57d-23038116b0fe` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-e56727d1-26f1-4c45-b7bb-37f341dcdf8b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-60593e74-5291-4a52-90e6-c3fc73c93213` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-930fbd10-d678-4bb9-ad81-4fc6456dee97` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-68f36624-a6f4-4855-bae6-42c70b881166` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-6ac8b7b4-5b8c-4380-871f-8227587b3383` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5848b81f-27f5-401f-b5aa-06528587a241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5848b81f-27f5-401f-b5aa-06528587a241
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d193ef14fe","displayName":"QA d0d193ef14fe","password":"****","region":"eu"}

--- response: 201 in 396 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5848b81f-27f5-401f-b5aa-06528587a241
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-d0d193ef14fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e93a7224-edb7-40e7-ba6f-fc7853ca48ba","handle":"qa-d0d193ef14fe","displayName":"QA d0d193ef14fe","region":"eu","role":"user","createdAt":"2026-11-06T09:30:38.785190361Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5afb9028-7e09-4978-b2ec-44216a52f22a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5afb9028-7e09-4978-b2ec-44216a52f22a
Content-Type: application/json

--- request body ---
{"handle":"qa-7bfee1dd9767","displayName":"QA 7bfee1dd9767","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-5afb9028-7e09-4978-b2ec-44216a52f22a
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
Location: /v1/accounts/qa-7bfee1dd9767
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06fa170b-d1ba-4f97-973b-463a5f69549d","handle":"qa-7bfee1dd9767","displayName":"QA 7bfee1dd9767","region":"eu","role":"user","createdAt":"2026-11-06T09:30:39.269604806Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-758e7914-3c6c-4808-a47a-70b2ccd6c459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758e7914-3c6c-4808-a47a-70b2ccd6c459
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d193ef14fe","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-758e7914-3c6c-4808-a47a-70b2ccd6c459
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e93a7224-edb7-40e7-ba6f-fc7853ca48ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-71ae94d1-be19-4cc6-a2af-5d967aff3a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71ae94d1-be19-4cc6-a2af-5d967aff3a9c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7bfee1dd9767","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 70 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-71ae94d1-be19-4cc6-a2af-5d967aff3a9c
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
Location: /v1/conversations/cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997","subject":"Lunch?","status":"open","region":"eu","participants":["qa-d0d193ef14fe","qa-7bfee1dd9767"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:39.429833663Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1753f8b2-f413-481b-ac93-d7961c810f7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1753f8b2-f413-481b-ac93-d7961c810f7a
Content-Type: application/json

--- request body ---
{"handle":"qa-7bfee1dd9767","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-1753f8b2-f413-481b-ac93-d7961c810f7a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06fa170b-d1ba-4f97-973b-463a5f69549d"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997/messages
correlation: qa-92e10cc7-8fab-4c83-a57d-23038116b0fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e10cc7-8fab-4c83-a57d-23038116b0fe
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-92e10cc7-8fab-4c83-a57d-23038116b0fe
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

{"id":"msg_8b80ff83-fb71-44c5-8567-47d684e9b05b","conversationId":"cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997","sender":"qa-7bfee1dd9767","body":"Friday works","createdAt":"2026-11-06T09:30:39.561441508Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997/messages
correlation: qa-e56727d1-26f1-4c45-b7bb-37f341dcdf8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56727d1-26f1-4c45-b7bb-37f341dcdf8b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e56727d1-26f1-4c45-b7bb-37f341dcdf8b
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

{"items":[{"id":"msg_07df2cb5-b931-4e27-ab10-1a0f10e1948b","conversationId":"cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997","sender":"qa-d0d193ef14fe","body":"Free on Friday?","createdAt":"2026-11-06T09:30:39.430115939Z"},{"id":"msg_8b80ff83-fb71-44c5-8567-47d684e9b05b","conversationId":"cnv_72e2cc40-d5ee-4ed3-8694-c1a23a2dd997","sender":"qa-7bfee1dd9767","body":"Friday works","createdAt":"2026-11-06T09:30:39.561441508Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60593e74-5291-4a52-90e6-c3fc73c93213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60593e74-5291-4a52-90e6-c3fc73c93213
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60593e74-5291-4a52-90e6-c3fc73c93213
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
correlation: qa-930fbd10-d678-4bb9-ad81-4fc6456dee97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-930fbd10-d678-4bb9-ad81-4fc6456dee97
Content-Type: application/json

--- request body ---
{"handle":"qa-7bfee1dd9767","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-930fbd10-d678-4bb9-ad81-4fc6456dee97
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-930fbd10-d678-4bb9-ad81-4fc6456dee97"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68f36624-a6f4-4855-bae6-42c70b881166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f36624-a6f4-4855-bae6-42c70b881166
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68f36624-a6f4-4855-bae6-42c70b881166
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
correlation: qa-6ac8b7b4-5b8c-4380-871f-8227587b3383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac8b7b4-5b8c-4380-871f-8227587b3383
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d193ef14fe","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ac8b7b4-5b8c-4380-871f-8227587b3383
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ac8b7b4-5b8c-4380-871f-8227587b3383"}
```
