# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 317 | `qa-500dfd9f-4c9a-4646-a264-4f5d15c5bf2a` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-4b9732a7-cb22-45b5-aae5-6f86226bc826` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-17f9bbe4-1885-42dc-bd67-49ff4ba2de18` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-05e82d44-d413-4f46-b8eb-5b26d3e8ea32` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 22 | `qa-47df9b85-f484-4126-87e3-f48d373b07fa` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-380b0968-070e-4f2b-bc21-d9261f95dd17` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 28 | `qa-33a147f4-4b9a-4689-aea7-261dfdfe41d6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8138d988-d44e-48d8-ab62-fd0936454d67` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-63a0fd40-f1f7-4daa-9ff0-0a799411ac4c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ea888c6b-d4f1-413f-ba44-8a0a1a36c050` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-b2ea12c0-c6a9-42ca-82bc-a2c8da814c7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-500dfd9f-4c9a-4646-a264-4f5d15c5bf2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-500dfd9f-4c9a-4646-a264-4f5d15c5bf2a
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe128ff6ff9","displayName":"QA 2fe128ff6ff9","password":"****","region":"eu"}

--- response: 201 in 317 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-500dfd9f-4c9a-4646-a264-4f5d15c5bf2a
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
Location: /v1/accounts/qa-2fe128ff6ff9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50ca4fd2-3ced-4ba8-b658-ba2ac74f923c","handle":"qa-2fe128ff6ff9","displayName":"QA 2fe128ff6ff9","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.275171826Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b9732a7-cb22-45b5-aae5-6f86226bc826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b9732a7-cb22-45b5-aae5-6f86226bc826
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd8b1a1d8d6","displayName":"QA 6bd8b1a1d8d6","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b9732a7-cb22-45b5-aae5-6f86226bc826
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
Location: /v1/accounts/qa-6bd8b1a1d8d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a5012477-6980-4204-a02b-e4621565adad","handle":"qa-6bd8b1a1d8d6","displayName":"QA 6bd8b1a1d8d6","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.660211612Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17f9bbe4-1885-42dc-bd67-49ff4ba2de18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17f9bbe4-1885-42dc-bd67-49ff4ba2de18
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe128ff6ff9","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-17f9bbe4-1885-42dc-bd67-49ff4ba2de18
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50ca4fd2-3ced-4ba8-b658-ba2ac74f923c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-05e82d44-d413-4f46-b8eb-5b26d3e8ea32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05e82d44-d413-4f46-b8eb-5b26d3e8ea32
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6bd8b1a1d8d6","subject":"Quick question","message":"Hi"}

--- response: 201 in 46 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-05e82d44-d413-4f46-b8eb-5b26d3e8ea32
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
Location: /v1/conversations/cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2","subject":"Quick question","status":"open","region":"eu","participants":["qa-2fe128ff6ff9","qa-6bd8b1a1d8d6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.759394329Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2/close
correlation: qa-47df9b85-f484-4126-87e3-f48d373b07fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47df9b85-f484-4126-87e3-f48d373b07fa
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-47df9b85-f484-4126-87e3-f48d373b07fa
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
Content-Length: 283

{"id":"cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2","subject":"Quick question","status":"closed","region":"eu","participants":["qa-2fe128ff6ff9","qa-6bd8b1a1d8d6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.759394329Z","closedAt":"2026-10-24T07:25:02.838868608Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-380b0968-070e-4f2b-bc21-d9261f95dd17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-380b0968-070e-4f2b-bc21-d9261f95dd17
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd8b1a1d8d6","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-380b0968-070e-4f2b-bc21-d9261f95dd17
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a5012477-6980-4204-a02b-e4621565adad"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2/messages
correlation: qa-33a147f4-4b9a-4689-aea7-261dfdfe41d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a147f4-4b9a-4689-aea7-261dfdfe41d6
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33a147f4-4b9a-4689-aea7-261dfdfe41d6
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_4d3fb194-c5ed-4f76-8dfa-e102139152f2/messages","correlationId":"qa-33a147f4-4b9a-4689-aea7-261dfdfe41d6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8138d988-d44e-48d8-ab62-fd0936454d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8138d988-d44e-48d8-ab62-fd0936454d67
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8138d988-d44e-48d8-ab62-fd0936454d67
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
correlation: qa-63a0fd40-f1f7-4daa-9ff0-0a799411ac4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a0fd40-f1f7-4daa-9ff0-0a799411ac4c
Content-Type: application/json

--- request body ---
{"handle":"qa-6bd8b1a1d8d6","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63a0fd40-f1f7-4daa-9ff0-0a799411ac4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63a0fd40-f1f7-4daa-9ff0-0a799411ac4c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea888c6b-d4f1-413f-ba44-8a0a1a36c050

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea888c6b-d4f1-413f-ba44-8a0a1a36c050
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea888c6b-d4f1-413f-ba44-8a0a1a36c050
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
correlation: qa-b2ea12c0-c6a9-42ca-82bc-a2c8da814c7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ea12c0-c6a9-42ca-82bc-a2c8da814c7c
Content-Type: application/json

--- request body ---
{"handle":"qa-2fe128ff6ff9","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2ea12c0-c6a9-42ca-82bc-a2c8da814c7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2ea12c0-c6a9-42ca-82bc-a2c8da814c7c"}
```
