# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-26824155-436e-4009-a7e3-863ca06863dd` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-577c45bd-9bd8-4d85-9114-ecd3e7db1e35` |
| 3 | `POST /v1/accounts` | 201 | 37 | `qa-d5d73ba4-7f7c-4df9-9bf7-d49771e66f00` |
| 4 | `POST /v1/auth/token` | 200 | 23 | `qa-0584c3c2-d708-415e-b80a-d42c590f47b1` |
| 5 | `POST /v1/conversations` | 201 | 25 | `qa-2907e5d8-3036-453b-9e28-9451a98bdc11` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-745ca58b-8d52-48ce-a1e1-d1b1b9a64add` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 19 | `qa-483ca914-22dc-48c5-aa28-b5c4f598d70f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-14200b5a-5f53-464f-a622-ca7d71a5a228` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-1bbd46e8-ce2c-4775-b711-e7fcc71f80fe` |
| 10 | `POST /v1/auth/token` | 200 | 51 | `qa-da183241-b05d-41c0-a8ec-d9b8cfa9f9cc` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7dd64458-d6a1-4fcc-9f7c-a8d0f0926dd6` |
| 12 | `POST /v1/auth/token` | 401 | 30 | `qa-b204782a-e6d6-424a-9447-6c24da294693` |
| 13 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-a452518d-abcc-43c6-a7fe-9939d72560e4` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-e2fafd9e-4be1-4bc6-b034-030e5fb36a9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26824155-436e-4009-a7e3-863ca06863dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26824155-436e-4009-a7e3-863ca06863dd
Content-Type: application/json

--- request body ---
{"handle":"qa-7a806d0399c1","displayName":"QA 7a806d0399c1","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-26824155-436e-4009-a7e3-863ca06863dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-7a806d0399c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a59eaf1-dd1f-4f13-91c8-c937608626b7","handle":"qa-7a806d0399c1","displayName":"QA 7a806d0399c1","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.247081259Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-577c45bd-9bd8-4d85-9114-ecd3e7db1e35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577c45bd-9bd8-4d85-9114-ecd3e7db1e35
Content-Type: application/json

--- request body ---
{"handle":"qa-a71f9aff1c46","displayName":"QA a71f9aff1c46","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-577c45bd-9bd8-4d85-9114-ecd3e7db1e35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-a71f9aff1c46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4009321e-3ebd-4eae-aa51-d02cc40dbf8d","handle":"qa-a71f9aff1c46","displayName":"QA a71f9aff1c46","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.283467974Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d5d73ba4-7f7c-4df9-9bf7-d49771e66f00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d73ba4-7f7c-4df9-9bf7-d49771e66f00
Content-Type: application/json

--- request body ---
{"handle":"qa-a235ed656a86","displayName":"QA a235ed656a86","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5d73ba4-7f7c-4df9-9bf7-d49771e66f00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-a235ed656a86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_552b54cd-6a1b-4009-9330-d11235ad4eee","handle":"qa-a235ed656a86","displayName":"QA a235ed656a86","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.334657802Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0584c3c2-d708-415e-b80a-d42c590f47b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0584c3c2-d708-415e-b80a-d42c590f47b1
Content-Type: application/json

--- request body ---
{"handle":"qa-7a806d0399c1","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0584c3c2-d708-415e-b80a-d42c590f47b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a59eaf1-dd1f-4f13-91c8-c937608626b7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2907e5d8-3036-453b-9e28-9451a98bdc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2907e5d8-3036-453b-9e28-9451a98bdc11
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a71f9aff1c46","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2907e5d8-3036-453b-9e28-9451a98bdc11
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
Location: /v1/conversations/cnv_4b994298-59ac-402f-bd31-854f43ae6436
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b994298-59ac-402f-bd31-854f43ae6436","subject":"Error contract","status":"open","region":"eu","participants":["qa-7a806d0399c1","qa-a71f9aff1c46"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.405273211Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-745ca58b-8d52-48ce-a1e1-d1b1b9a64add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745ca58b-8d52-48ce-a1e1-d1b1b9a64add
Content-Type: application/json

--- request body ---
{"handle":"qa-a235ed656a86","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-745ca58b-8d52-48ce-a1e1-d1b1b9a64add
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_552b54cd-6a1b-4009-9330-d11235ad4eee"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4b994298-59ac-402f-bd31-854f43ae6436/messages
correlation: qa-483ca914-22dc-48c5-aa28-b5c4f598d70f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-483ca914-22dc-48c5-aa28-b5c4f598d70f
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-483ca914-22dc-48c5-aa28-b5c4f598d70f
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4b994298-59ac-402f-bd31-854f43ae6436/messages","correlationId":"qa-483ca914-22dc-48c5-aa28-b5c4f598d70f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14200b5a-5f53-464f-a622-ca7d71a5a228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14200b5a-5f53-464f-a622-ca7d71a5a228
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14200b5a-5f53-464f-a622-ca7d71a5a228
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
correlation: qa-1bbd46e8-ce2c-4775-b711-e7fcc71f80fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bbd46e8-ce2c-4775-b711-e7fcc71f80fe
Content-Type: application/json

--- request body ---
{"handle":"qa-a235ed656a86","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bbd46e8-ce2c-4775-b711-e7fcc71f80fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bbd46e8-ce2c-4775-b711-e7fcc71f80fe"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-da183241-b05d-41c0-a8ec-d9b8cfa9f9cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da183241-b05d-41c0-a8ec-d9b8cfa9f9cc
Content-Type: application/json

--- request body ---
{"handle":"qa-a71f9aff1c46","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-da183241-b05d-41c0-a8ec-d9b8cfa9f9cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4009321e-3ebd-4eae-aa51-d02cc40dbf8d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7dd64458-d6a1-4fcc-9f7c-a8d0f0926dd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dd64458-d6a1-4fcc-9f7c-a8d0f0926dd6
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7dd64458-d6a1-4fcc-9f7c-a8d0f0926dd6
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b204782a-e6d6-424a-9447-6c24da294693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b204782a-e6d6-424a-9447-6c24da294693
Content-Type: application/json

--- request body ---
{"handle":"qa-a71f9aff1c46","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b204782a-e6d6-424a-9447-6c24da294693
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b204782a-e6d6-424a-9447-6c24da294693"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a452518d-abcc-43c6-a7fe-9939d72560e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a452518d-abcc-43c6-a7fe-9939d72560e4
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a452518d-abcc-43c6-a7fe-9939d72560e4
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-e2fafd9e-4be1-4bc6-b034-030e5fb36a9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fafd9e-4be1-4bc6-b034-030e5fb36a9d
Content-Type: application/json

--- request body ---
{"handle":"qa-7a806d0399c1","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2fafd9e-4be1-4bc6-b034-030e5fb36a9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2fafd9e-4be1-4bc6-b034-030e5fb36a9d"}
```
