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
| 1 | `POST /v1/accounts` | 201 | 377 | `qa-e3d884b5-6054-4e14-9aaf-dced98c2ba23` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-f2f7c33c-f282-4380-91b3-a73ee63ee5bc` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-3241143b-fae0-4e15-b8d5-c6b515220e82` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-6c4587c2-aa5b-4ba8-ad01-d973d4cbe5f5` |
| 5 | `POST /v1/auth/token` | 200 | 24 | `qa-7db9cfc8-b80d-4ee7-bde7-ef86f26ba20a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 39 | `qa-45e61bfc-8b06-4b0f-82d8-2ebbc0999c10` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 12 | `qa-9f7f33f3-f063-4aea-bee4-347a53554493` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3aa7e364-bdbe-4217-8c7b-3f34e7bddc53` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-2d776506-9367-4c2d-89d0-fe62f01ce98a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5b5a6cbb-377e-4f4d-8be0-d294bf2b616a` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-8482fb17-615e-4a89-bb59-38efdf1e8bc2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3d884b5-6054-4e14-9aaf-dced98c2ba23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d884b5-6054-4e14-9aaf-dced98c2ba23
Content-Type: application/json

--- request body ---
{"handle":"qa-2747ff209301","displayName":"QA 2747ff209301","password":"****","region":"eu"}

--- response: 201 in 377 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3d884b5-6054-4e14-9aaf-dced98c2ba23
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
Location: /v1/accounts/qa-2747ff209301
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e903955-0d39-412d-8572-d67a0b830e88","handle":"qa-2747ff209301","displayName":"QA 2747ff209301","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.215963879Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2f7c33c-f282-4380-91b3-a73ee63ee5bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2f7c33c-f282-4380-91b3-a73ee63ee5bc
Content-Type: application/json

--- request body ---
{"handle":"qa-99df921ac147","displayName":"QA 99df921ac147","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2f7c33c-f282-4380-91b3-a73ee63ee5bc
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
Location: /v1/accounts/qa-99df921ac147
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66119438-a158-4dd1-ac3e-ca4366882c19","handle":"qa-99df921ac147","displayName":"QA 99df921ac147","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.601153113Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3241143b-fae0-4e15-b8d5-c6b515220e82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3241143b-fae0-4e15-b8d5-c6b515220e82
Content-Type: application/json

--- request body ---
{"handle":"qa-2747ff209301","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3241143b-fae0-4e15-b8d5-c6b515220e82
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e903955-0d39-412d-8572-d67a0b830e88"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6c4587c2-aa5b-4ba8-ad01-d973d4cbe5f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c4587c2-aa5b-4ba8-ad01-d973d4cbe5f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-99df921ac147","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 59 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c4587c2-aa5b-4ba8-ad01-d973d4cbe5f5
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
Location: /v1/conversations/cnv_5172950a-4426-4b1a-ad4c-c01b936d1398
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_5172950a-4426-4b1a-ad4c-c01b936d1398","subject":"Lunch?","status":"open","region":"eu","participants":["qa-2747ff209301","qa-99df921ac147"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:15.767266793Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7db9cfc8-b80d-4ee7-bde7-ef86f26ba20a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7db9cfc8-b80d-4ee7-bde7-ef86f26ba20a
Content-Type: application/json

--- request body ---
{"handle":"qa-99df921ac147","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7db9cfc8-b80d-4ee7-bde7-ef86f26ba20a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66119438-a158-4dd1-ac3e-ca4366882c19"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5172950a-4426-4b1a-ad4c-c01b936d1398/messages
correlation: qa-45e61bfc-8b06-4b0f-82d8-2ebbc0999c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e61bfc-8b06-4b0f-82d8-2ebbc0999c10
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-45e61bfc-8b06-4b0f-82d8-2ebbc0999c10
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

{"id":"msg_61a1c26f-3f5a-45ca-ae25-7e9f740f9636","conversationId":"cnv_5172950a-4426-4b1a-ad4c-c01b936d1398","sender":"qa-99df921ac147","body":"Friday works","createdAt":"2026-11-28T10:37:15.916872405Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5172950a-4426-4b1a-ad4c-c01b936d1398/messages
correlation: qa-9f7f33f3-f063-4aea-bee4-347a53554493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f7f33f3-f063-4aea-bee4-347a53554493
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f7f33f3-f063-4aea-bee4-347a53554493
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

{"items":[{"id":"msg_36c244fb-2f4d-49e3-b44d-6dc8e2befb0a","conversationId":"cnv_5172950a-4426-4b1a-ad4c-c01b936d1398","sender":"qa-2747ff209301","body":"Free on Friday?","createdAt":"2026-11-28T10:37:15.767538960Z"},{"id":"msg_61a1c26f-3f5a-45ca-ae25-7e9f740f9636","conversationId":"cnv_5172950a-4426-4b1a-ad4c-c01b936d1398","sender":"qa-99df921ac147","body":"Friday works","createdAt":"2026-11-28T10:37:15.916872405Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3aa7e364-bdbe-4217-8c7b-3f34e7bddc53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aa7e364-bdbe-4217-8c7b-3f34e7bddc53
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3aa7e364-bdbe-4217-8c7b-3f34e7bddc53
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
correlation: qa-2d776506-9367-4c2d-89d0-fe62f01ce98a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d776506-9367-4c2d-89d0-fe62f01ce98a
Content-Type: application/json

--- request body ---
{"handle":"qa-99df921ac147","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d776506-9367-4c2d-89d0-fe62f01ce98a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d776506-9367-4c2d-89d0-fe62f01ce98a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b5a6cbb-377e-4f4d-8be0-d294bf2b616a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b5a6cbb-377e-4f4d-8be0-d294bf2b616a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b5a6cbb-377e-4f4d-8be0-d294bf2b616a
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
correlation: qa-8482fb17-615e-4a89-bb59-38efdf1e8bc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8482fb17-615e-4a89-bb59-38efdf1e8bc2
Content-Type: application/json

--- request body ---
{"handle":"qa-2747ff209301","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8482fb17-615e-4a89-bb59-38efdf1e8bc2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8482fb17-615e-4a89-bb59-38efdf1e8bc2"}
```
