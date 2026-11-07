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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-3640e456-da5f-4079-9c8c-946848801eb2` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-12e8e40c-7336-4eab-8469-82595f29b640` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-2f37087d-55da-4add-ad17-781ebf1efb36` |
| 4 | `POST /v1/auth/token` | 200 | 8 | `qa-7243a961-92c4-41f7-8a8c-dfa178e72507` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-e923233f-22d2-46b0-a580-b3b74f346ab4` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-717329ae-b085-4158-bf7f-3540c999d50c` |
| 7 | `GET /v1/conversations/{id}` | 403 | 16 | `qa-7d294826-f2d4-40a3-aa0b-32cceec1dcd0` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-0f1a774f-a654-45bb-82f9-a83cc27e2e82` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-8f3f188c-5294-4fb8-b408-d60e3b80b3e4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-c30e15c1-f07d-4786-88fa-3402b8d04351` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-47d1e042-e173-462e-8300-2c25170e9c39` |
| 12 | `POST /v1/auth/token` | 200 | 26 | `qa-4a0458e3-18eb-455e-8b6b-3b3487fbc651` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c34faca9-fae5-4502-8211-1dacab0b8467` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-7c65b2b7-317c-4983-b230-04fd5a4b34ff` |
| 15 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-dc5f645c-6643-4c90-ae5c-de1aef40c326` |
| 16 | `POST /v1/auth/token` | 401 | 3 | `qa-2dc02372-f126-4806-a40f-ad2d176e6ec1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3640e456-da5f-4079-9c8c-946848801eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3640e456-da5f-4079-9c8c-946848801eb2
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1fce6728d8","displayName":"QA ae1fce6728d8","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3640e456-da5f-4079-9c8c-946848801eb2
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
Location: /v1/accounts/qa-ae1fce6728d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd5bda39-8677-46e7-8793-5368fbdcff27","handle":"qa-ae1fce6728d8","displayName":"QA ae1fce6728d8","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.261002644Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12e8e40c-7336-4eab-8469-82595f29b640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e8e40c-7336-4eab-8469-82595f29b640
Content-Type: application/json

--- request body ---
{"handle":"qa-3f2c18b24156","displayName":"QA 3f2c18b24156","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-12e8e40c-7336-4eab-8469-82595f29b640
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
Location: /v1/accounts/qa-3f2c18b24156
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d6e702d-4121-4a57-a15a-2a7e78093c3d","handle":"qa-3f2c18b24156","displayName":"QA 3f2c18b24156","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.293940663Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2f37087d-55da-4add-ad17-781ebf1efb36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f37087d-55da-4add-ad17-781ebf1efb36
Content-Type: application/json

--- request body ---
{"handle":"qa-17ecd11ebf27","displayName":"QA 17ecd11ebf27","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f37087d-55da-4add-ad17-781ebf1efb36
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
Location: /v1/accounts/qa-17ecd11ebf27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f1db2d8-871e-40c0-91e7-4a91af73ad0a","handle":"qa-17ecd11ebf27","displayName":"QA 17ecd11ebf27","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.314066915Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7243a961-92c4-41f7-8a8c-dfa178e72507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7243a961-92c4-41f7-8a8c-dfa178e72507
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1fce6728d8","password":"****"}

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7243a961-92c4-41f7-8a8c-dfa178e72507
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd5bda39-8677-46e7-8793-5368fbdcff27"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e923233f-22d2-46b0-a580-b3b74f346ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e923233f-22d2-46b0-a580-b3b74f346ab4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f2c18b24156","subject":"Private","message":"Just us"}

--- response: 201 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e923233f-22d2-46b0-a580-b3b74f346ab4
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
Location: /v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_a991cff8-7da7-42c3-8cec-a65a185fe355","subject":"Private","status":"open","region":"eu","participants":["qa-ae1fce6728d8","qa-3f2c18b24156"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.345203600Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-717329ae-b085-4158-bf7f-3540c999d50c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-717329ae-b085-4158-bf7f-3540c999d50c
Content-Type: application/json

--- request body ---
{"handle":"qa-17ecd11ebf27","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-717329ae-b085-4158-bf7f-3540c999d50c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f1db2d8-871e-40c0-91e7-4a91af73ad0a"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355
correlation: qa-7d294826-f2d4-40a3-aa0b-32cceec1dcd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d294826-f2d4-40a3-aa0b-32cceec1dcd0
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d294826-f2d4-40a3-aa0b-32cceec1dcd0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355","correlationId":"qa-7d294826-f2d4-40a3-aa0b-32cceec1dcd0"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355/messages
correlation: qa-0f1a774f-a654-45bb-82f9-a83cc27e2e82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f1a774f-a654-45bb-82f9-a83cc27e2e82
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f1a774f-a654-45bb-82f9-a83cc27e2e82
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355/messages","correlationId":"qa-0f1a774f-a654-45bb-82f9-a83cc27e2e82"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355/messages
correlation: qa-8f3f188c-5294-4fb8-b408-d60e3b80b3e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3f188c-5294-4fb8-b408-d60e3b80b3e4
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f3f188c-5294-4fb8-b408-d60e3b80b3e4
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a991cff8-7da7-42c3-8cec-a65a185fe355/messages","correlationId":"qa-8f3f188c-5294-4fb8-b408-d60e3b80b3e4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c30e15c1-f07d-4786-88fa-3402b8d04351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30e15c1-f07d-4786-88fa-3402b8d04351
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c30e15c1-f07d-4786-88fa-3402b8d04351
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
correlation: qa-47d1e042-e173-462e-8300-2c25170e9c39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d1e042-e173-462e-8300-2c25170e9c39
Content-Type: application/json

--- request body ---
{"handle":"qa-17ecd11ebf27","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47d1e042-e173-462e-8300-2c25170e9c39
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47d1e042-e173-462e-8300-2c25170e9c39"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4a0458e3-18eb-455e-8b6b-3b3487fbc651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a0458e3-18eb-455e-8b6b-3b3487fbc651
Content-Type: application/json

--- request body ---
{"handle":"qa-3f2c18b24156","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a0458e3-18eb-455e-8b6b-3b3487fbc651
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d6e702d-4121-4a57-a15a-2a7e78093c3d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c34faca9-fae5-4502-8211-1dacab0b8467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34faca9-fae5-4502-8211-1dacab0b8467
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c34faca9-fae5-4502-8211-1dacab0b8467
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
correlation: qa-7c65b2b7-317c-4983-b230-04fd5a4b34ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c65b2b7-317c-4983-b230-04fd5a4b34ff
Content-Type: application/json

--- request body ---
{"handle":"qa-3f2c18b24156","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c65b2b7-317c-4983-b230-04fd5a4b34ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c65b2b7-317c-4983-b230-04fd5a4b34ff"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc5f645c-6643-4c90-ae5c-de1aef40c326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc5f645c-6643-4c90-ae5c-de1aef40c326
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc5f645c-6643-4c90-ae5c-de1aef40c326
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
correlation: qa-2dc02372-f126-4806-a40f-ad2d176e6ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dc02372-f126-4806-a40f-ad2d176e6ec1
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1fce6728d8","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dc02372-f126-4806-a40f-ad2d176e6ec1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2dc02372-f126-4806-a40f-ad2d176e6ec1"}
```
