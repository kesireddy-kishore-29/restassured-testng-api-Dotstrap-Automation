# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 307 | `qa-07e4e860-545a-4f4d-a6f1-353b7e493791` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-4fc11a8e-f7e5-44df-8384-7f936d05263e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-ffd19c27-581b-4eb6-9bfc-f3d124555cb7` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-3cbab143-bd64-4c42-88a3-dcd3d25f76b0` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-80d6e1e4-a615-4759-b61f-f2ecd8b3dee7` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-bdd999de-2496-4ba8-b04e-1ec8dbaa1b89` |
| 7 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-89649be6-b169-4768-89b2-e69425f2c14e` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-37408b4c-b959-4f5d-a17f-f1d8df880534` |
| 9 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-95248db5-4e19-4aa1-90ba-66d7fe716a00` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-da89b511-9201-4db0-8807-75b7b13fae64` |
| 11 | `POST /v1/auth/token` | 401 | 15 | `qa-6ca95c25-8175-426b-9159-2678b87efa4a` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-649ea136-9589-4b53-bc2f-b4dd8c0737c0` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-d2d5b1f0-3232-4c26-b5e4-d0c3d99af122` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07e4e860-545a-4f4d-a6f1-353b7e493791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07e4e860-545a-4f4d-a6f1-353b7e493791
Content-Type: application/json

--- request body ---
{"handle":"qa-db32780d4eee","displayName":"QA db32780d4eee","password":"****","region":"eu"}

--- response: 201 in 307 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-07e4e860-545a-4f4d-a6f1-353b7e493791
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
Location: /v1/accounts/qa-db32780d4eee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae7f69b9-4d11-43ca-95ac-f8acf40d7836","handle":"qa-db32780d4eee","displayName":"QA db32780d4eee","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.310464506Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4fc11a8e-f7e5-44df-8384-7f936d05263e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fc11a8e-f7e5-44df-8384-7f936d05263e
Content-Type: application/json

--- request body ---
{"handle":"qa-eca58c13d4e0","displayName":"QA eca58c13d4e0","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fc11a8e-f7e5-44df-8384-7f936d05263e
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
Location: /v1/accounts/qa-eca58c13d4e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8bd9ec04-a400-4e9c-9ba4-136904ed3573","handle":"qa-eca58c13d4e0","displayName":"QA eca58c13d4e0","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.660626184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ffd19c27-581b-4eb6-9bfc-f3d124555cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffd19c27-581b-4eb6-9bfc-f3d124555cb7
Content-Type: application/json

--- request body ---
{"handle":"qa-db32780d4eee","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffd19c27-581b-4eb6-9bfc-f3d124555cb7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae7f69b9-4d11-43ca-95ac-f8acf40d7836"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3cbab143-bd64-4c42-88a3-dcd3d25f76b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cbab143-bd64-4c42-88a3-dcd3d25f76b0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eca58c13d4e0","subject":"Updates","message":"First"}

--- response: 201 in 47 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cbab143-bd64-4c42-88a3-dcd3d25f76b0
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
Location: /v1/conversations/cnv_aef61085-c561-4702-9002-8dc0de711961
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_aef61085-c561-4702-9002-8dc0de711961","subject":"Updates","status":"open","region":"eu","participants":["qa-db32780d4eee","qa-eca58c13d4e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.759138683Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_aef61085-c561-4702-9002-8dc0de711961/messages
correlation: qa-80d6e1e4-a615-4759-b61f-f2ecd8b3dee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d6e1e4-a615-4759-b61f-f2ecd8b3dee7
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-80d6e1e4-a615-4759-b61f-f2ecd8b3dee7
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
Content-Length: 197

{"id":"msg_a6c727c1-188c-4cea-8ff8-691b204c7d5d","conversationId":"cnv_aef61085-c561-4702-9002-8dc0de711961","sender":"qa-db32780d4eee","body":"Second","createdAt":"2026-10-24T07:25:02.839041394Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdd999de-2496-4ba8-b04e-1ec8dbaa1b89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdd999de-2496-4ba8-b04e-1ec8dbaa1b89
Content-Type: application/json

--- request body ---
{"handle":"qa-eca58c13d4e0","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdd999de-2496-4ba8-b04e-1ec8dbaa1b89
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8bd9ec04-a400-4e9c-9ba4-136904ed3573"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_aef61085-c561-4702-9002-8dc0de711961
correlation: qa-89649be6-b169-4768-89b2-e69425f2c14e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89649be6-b169-4768-89b2-e69425f2c14e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-89649be6-b169-4768-89b2-e69425f2c14e
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_aef61085-c561-4702-9002-8dc0de711961","subject":"Updates","status":"open","region":"eu","participants":["qa-db32780d4eee","qa-eca58c13d4e0"],"messageCount":2,"unreadCount":2,"createdAt":"2026-10-24T07:25:02.759138683Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_aef61085-c561-4702-9002-8dc0de711961/read
correlation: qa-37408b4c-b959-4f5d-a17f-f1d8df880534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37408b4c-b959-4f5d-a17f-f1d8df880534
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-37408b4c-b959-4f5d-a17f-f1d8df880534
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
Content-Length: 77

{"conversationId":"cnv_aef61085-c561-4702-9002-8dc0de711961","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_aef61085-c561-4702-9002-8dc0de711961
correlation: qa-95248db5-4e19-4aa1-90ba-66d7fe716a00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95248db5-4e19-4aa1-90ba-66d7fe716a00
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-95248db5-4e19-4aa1-90ba-66d7fe716a00
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
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_aef61085-c561-4702-9002-8dc0de711961","subject":"Updates","status":"open","region":"eu","participants":["qa-db32780d4eee","qa-eca58c13d4e0"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.759138683Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da89b511-9201-4db0-8807-75b7b13fae64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da89b511-9201-4db0-8807-75b7b13fae64
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da89b511-9201-4db0-8807-75b7b13fae64
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
correlation: qa-6ca95c25-8175-426b-9159-2678b87efa4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca95c25-8175-426b-9159-2678b87efa4a
Content-Type: application/json

--- request body ---
{"handle":"qa-eca58c13d4e0","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ca95c25-8175-426b-9159-2678b87efa4a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ca95c25-8175-426b-9159-2678b87efa4a"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-649ea136-9589-4b53-bc2f-b4dd8c0737c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649ea136-9589-4b53-bc2f-b4dd8c0737c0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-649ea136-9589-4b53-bc2f-b4dd8c0737c0
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

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-d2d5b1f0-3232-4c26-b5e4-d0c3d99af122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d5b1f0-3232-4c26-b5e4-d0c3d99af122
Content-Type: application/json

--- request body ---
{"handle":"qa-db32780d4eee","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2d5b1f0-3232-4c26-b5e4-d0c3d99af122
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2d5b1f0-3232-4c26-b5e4-d0c3d99af122"}
```
