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
| 1 | `POST /v1/accounts` | 201 | 428 | `qa-f448df73-0f3b-4ac6-868e-bacb8bf41299` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-674c58ce-7568-4afa-989d-10463e363121` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-6ca1a96c-61da-4385-af3c-497ed9ed6826` |
| 4 | `POST /v1/conversations` | 201 | 93 | `qa-28d0163d-403b-413b-b2c1-1bd349eed0a9` |
| 5 | `POST /v1/auth/token` | 200 | 26 | `qa-96b60272-7f85-4048-96f1-dfb9b39bad91` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-fcf8b1fa-06d7-4805-b07d-7cc633278a88` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-c72f5b25-6ec0-4b2e-b8f5-202ed2b4efc1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4f300028-b664-42de-b44f-939c4d419891` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-9e5adbb2-6932-4568-90a0-ab30480081fd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0b9d01cb-e9a2-40c2-a51a-93fb17047330` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-faac9ed6-b0b5-4804-ad5b-456f444fc19d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f448df73-0f3b-4ac6-868e-bacb8bf41299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f448df73-0f3b-4ac6-868e-bacb8bf41299
Content-Type: application/json

--- request body ---
{"handle":"qa-82969535f472","displayName":"QA 82969535f472","password":"****","region":"eu"}

--- response: 201 in 428 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f448df73-0f3b-4ac6-868e-bacb8bf41299
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
Location: /v1/accounts/qa-82969535f472
X-Served-Region: eu
Content-Length: 181

{"id":"acc_07648e81-a90f-4503-8ede-bd4e35b88901","handle":"qa-82969535f472","displayName":"QA 82969535f472","region":"eu","role":"user","createdAt":"2026-10-27T08:00:25.925828154Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-674c58ce-7568-4afa-989d-10463e363121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674c58ce-7568-4afa-989d-10463e363121
Content-Type: application/json

--- request body ---
{"handle":"qa-ae764ede8ebd","displayName":"QA ae764ede8ebd","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-674c58ce-7568-4afa-989d-10463e363121
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
Location: /v1/accounts/qa-ae764ede8ebd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79dc4240-94b6-42a7-92b2-9e19c74648b7","handle":"qa-ae764ede8ebd","displayName":"QA ae764ede8ebd","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.384421717Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ca1a96c-61da-4385-af3c-497ed9ed6826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca1a96c-61da-4385-af3c-497ed9ed6826
Content-Type: application/json

--- request body ---
{"handle":"qa-82969535f472","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca1a96c-61da-4385-af3c-497ed9ed6826
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_07648e81-a90f-4503-8ede-bd4e35b88901"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-28d0163d-403b-413b-b2c1-1bd349eed0a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28d0163d-403b-413b-b2c1-1bd349eed0a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ae764ede8ebd","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 93 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-28d0163d-403b-413b-b2c1-1bd349eed0a9
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
Location: /v1/conversations/cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4","subject":"Lunch?","status":"open","region":"eu","participants":["qa-82969535f472","qa-ae764ede8ebd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:26.542043527Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-96b60272-7f85-4048-96f1-dfb9b39bad91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b60272-7f85-4048-96f1-dfb9b39bad91
Content-Type: application/json

--- request body ---
{"handle":"qa-ae764ede8ebd","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-96b60272-7f85-4048-96f1-dfb9b39bad91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79dc4240-94b6-42a7-92b2-9e19c74648b7"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4/messages
correlation: qa-fcf8b1fa-06d7-4805-b07d-7cc633278a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcf8b1fa-06d7-4805-b07d-7cc633278a88
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcf8b1fa-06d7-4805-b07d-7cc633278a88
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

{"id":"msg_51a011fa-5553-4d5d-84fa-ecf376e08d9c","conversationId":"cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4","sender":"qa-ae764ede8ebd","body":"Friday works","createdAt":"2026-10-27T08:00:26.693249912Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4/messages
correlation: qa-c72f5b25-6ec0-4b2e-b8f5-202ed2b4efc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c72f5b25-6ec0-4b2e-b8f5-202ed2b4efc1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c72f5b25-6ec0-4b2e-b8f5-202ed2b4efc1
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

{"items":[{"id":"msg_917a6f6c-4715-40bb-bbcd-694775af9fc1","conversationId":"cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4","sender":"qa-82969535f472","body":"Free on Friday?","createdAt":"2026-10-27T08:00:26.542321276Z"},{"id":"msg_51a011fa-5553-4d5d-84fa-ecf376e08d9c","conversationId":"cnv_c312074d-d7ae-4488-ad97-fe4131f2d5f4","sender":"qa-ae764ede8ebd","body":"Friday works","createdAt":"2026-10-27T08:00:26.693249912Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f300028-b664-42de-b44f-939c4d419891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f300028-b664-42de-b44f-939c4d419891
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f300028-b664-42de-b44f-939c4d419891
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
correlation: qa-9e5adbb2-6932-4568-90a0-ab30480081fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e5adbb2-6932-4568-90a0-ab30480081fd
Content-Type: application/json

--- request body ---
{"handle":"qa-ae764ede8ebd","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e5adbb2-6932-4568-90a0-ab30480081fd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9e5adbb2-6932-4568-90a0-ab30480081fd"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b9d01cb-e9a2-40c2-a51a-93fb17047330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9d01cb-e9a2-40c2-a51a-93fb17047330
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b9d01cb-e9a2-40c2-a51a-93fb17047330
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
correlation: qa-faac9ed6-b0b5-4804-ad5b-456f444fc19d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faac9ed6-b0b5-4804-ad5b-456f444fc19d
Content-Type: application/json

--- request body ---
{"handle":"qa-82969535f472","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faac9ed6-b0b5-4804-ad5b-456f444fc19d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faac9ed6-b0b5-4804-ad5b-456f444fc19d"}
```
