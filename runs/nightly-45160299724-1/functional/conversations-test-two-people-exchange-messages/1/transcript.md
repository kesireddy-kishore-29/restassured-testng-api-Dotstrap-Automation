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
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-a32dc505-6eeb-4458-b70f-a81afb05ca2b` |
| 2 | `POST /v1/accounts` | 201 | 88 | `qa-194b3f57-730a-40a8-949d-2041d8d5fcdc` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-d86e06fa-0c77-49e6-83f1-15d9cf796090` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-19fa6541-837a-41c2-b18a-d0f583ad3678` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-9ae2be55-1300-4143-9a66-fd8d4bb7f678` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-c7eab534-0d0c-438e-808f-7f9bff1f5b05` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-733dab9c-bbd2-4250-b621-95a16fb2d2fb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b0da1b07-75d1-49f9-9856-0213cd283b20` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-b658ad93-f9e9-48f5-bf83-3a30e3133127` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-bc47f37c-e222-4b46-b269-14de29d9b59b` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-6cd32d78-e33c-4b0f-a0bd-059c89cd66ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a32dc505-6eeb-4458-b70f-a81afb05ca2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a32dc505-6eeb-4458-b70f-a81afb05ca2b
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2ef4a93dad","displayName":"QA 6c2ef4a93dad","password":"****","region":"eu"}

--- response: 201 in 368 ms ---
Date: Mon, 23 Nov 2026 10:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a32dc505-6eeb-4458-b70f-a81afb05ca2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-6c2ef4a93dad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7eead622-576e-4046-8769-77c947540a15","handle":"qa-6c2ef4a93dad","displayName":"QA 6c2ef4a93dad","region":"eu","role":"user","createdAt":"2026-11-23T10:54:54.560580687Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-194b3f57-730a-40a8-949d-2041d8d5fcdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194b3f57-730a-40a8-949d-2041d8d5fcdc
Content-Type: application/json

--- request body ---
{"handle":"qa-3e140357ef26","displayName":"QA 3e140357ef26","password":"****","region":"eu"}

--- response: 201 in 88 ms ---
Date: Mon, 23 Nov 2026 10:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-194b3f57-730a-40a8-949d-2041d8d5fcdc
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
Location: /v1/accounts/qa-3e140357ef26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_112ce60f-ea79-438f-a75c-c5116e8bc49c","handle":"qa-3e140357ef26","displayName":"QA 3e140357ef26","region":"eu","role":"user","createdAt":"2026-11-23T10:54:54.998648018Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d86e06fa-0c77-49e6-83f1-15d9cf796090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d86e06fa-0c77-49e6-83f1-15d9cf796090
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2ef4a93dad","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d86e06fa-0c77-49e6-83f1-15d9cf796090
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7eead622-576e-4046-8769-77c947540a15"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-19fa6541-837a-41c2-b18a-d0f583ad3678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19fa6541-837a-41c2-b18a-d0f583ad3678
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e140357ef26","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 56 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-19fa6541-837a-41c2-b18a-d0f583ad3678
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
Location: /v1/conversations/cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc","subject":"Lunch?","status":"open","region":"eu","participants":["qa-6c2ef4a93dad","qa-3e140357ef26"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:55.121211982Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9ae2be55-1300-4143-9a66-fd8d4bb7f678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae2be55-1300-4143-9a66-fd8d4bb7f678
Content-Type: application/json

--- request body ---
{"handle":"qa-3e140357ef26","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ae2be55-1300-4143-9a66-fd8d4bb7f678
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_112ce60f-ea79-438f-a75c-c5116e8bc49c"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc/messages
correlation: qa-c7eab534-0d0c-438e-808f-7f9bff1f5b05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7eab534-0d0c-438e-808f-7f9bff1f5b05
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7eab534-0d0c-438e-808f-7f9bff1f5b05
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

{"id":"msg_7ca771da-89c6-4f98-a0b0-804034398421","conversationId":"cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc","sender":"qa-3e140357ef26","body":"Friday works","createdAt":"2026-11-23T10:54:55.232910920Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc/messages
correlation: qa-733dab9c-bbd2-4250-b621-95a16fb2d2fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-733dab9c-bbd2-4250-b621-95a16fb2d2fb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-733dab9c-bbd2-4250-b621-95a16fb2d2fb
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

{"items":[{"id":"msg_d2eae5c5-44d2-4acc-999d-ff0bd2eab587","conversationId":"cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc","sender":"qa-6c2ef4a93dad","body":"Free on Friday?","createdAt":"2026-11-23T10:54:55.121389335Z"},{"id":"msg_7ca771da-89c6-4f98-a0b0-804034398421","conversationId":"cnv_6bfcc3ae-3631-4bcc-9c91-4c7de6eeacfc","sender":"qa-3e140357ef26","body":"Friday works","createdAt":"2026-11-23T10:54:55.232910920Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b0da1b07-75d1-49f9-9856-0213cd283b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0da1b07-75d1-49f9-9856-0213cd283b20
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b0da1b07-75d1-49f9-9856-0213cd283b20
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
correlation: qa-b658ad93-f9e9-48f5-bf83-3a30e3133127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b658ad93-f9e9-48f5-bf83-3a30e3133127
Content-Type: application/json

--- request body ---
{"handle":"qa-3e140357ef26","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b658ad93-f9e9-48f5-bf83-3a30e3133127
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b658ad93-f9e9-48f5-bf83-3a30e3133127"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc47f37c-e222-4b46-b269-14de29d9b59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc47f37c-e222-4b46-b269-14de29d9b59b
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc47f37c-e222-4b46-b269-14de29d9b59b
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
correlation: qa-6cd32d78-e33c-4b0f-a0bd-059c89cd66ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd32d78-e33c-4b0f-a0bd-059c89cd66ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2ef4a93dad","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cd32d78-e33c-4b0f-a0bd-059c89cd66ff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6cd32d78-e33c-4b0f-a0bd-059c89cd66ff"}
```
