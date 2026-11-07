# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 705 | `qa-d61d98c2-45ef-4246-90ca-697904cb1f9c` |
| 2 | `POST /v1/accounts` | 201 | 80 | `qa-4766692b-84fc-4cc3-b25a-e7e48c1cb933` |
| 3 | `POST /v1/accounts` | 201 | 107 | `qa-bdbf09b6-6487-4062-9d71-3de6fb88478e` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-06dce48b-6b7c-422d-9f53-5e4e8337ea9a` |
| 5 | `POST /v1/conversations` | 201 | 63 | `qa-d57366f3-fafd-4213-9c7f-5d5ac9c9f575` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-46699bb9-3f4b-460a-ac1b-4ad9472d191e` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 23 | `qa-e2ab8d94-6a37-4f71-8206-5e0b59708287` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-deb152b2-a125-4d2a-9575-ae90343abc96` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-2ac454dc-676e-4b93-88ba-7a4bd1198310` |
| 10 | `POST /v1/auth/token` | 200 | 56 | `qa-11338efc-2ec7-4eab-9cfb-cc6aa4e96c6d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-4f61c886-5a12-4354-afea-05d9a3818e49` |
| 12 | `POST /v1/auth/token` | 401 | 52 | `qa-4f4dc2bc-53bb-4d47-9c2e-3c1e475bbd1a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-abba2497-4cc3-4a36-8da4-df0eff185d44` |
| 14 | `POST /v1/auth/token` | 401 | 31 | `qa-60fd1eb0-97d9-421a-8d89-ae7a5bd06dcc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d61d98c2-45ef-4246-90ca-697904cb1f9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d61d98c2-45ef-4246-90ca-697904cb1f9c
Content-Type: application/json

--- request body ---
{"handle":"qa-e8869caa747e","displayName":"QA e8869caa747e","password":"****","region":"eu"}

--- response: 201 in 705 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d61d98c2-45ef-4246-90ca-697904cb1f9c
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
Location: /v1/accounts/qa-e8869caa747e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7518d056-1655-401b-a1a0-2445b9d5d9b9","handle":"qa-e8869caa747e","displayName":"QA e8869caa747e","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.886018332Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4766692b-84fc-4cc3-b25a-e7e48c1cb933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4766692b-84fc-4cc3-b25a-e7e48c1cb933
Content-Type: application/json

--- request body ---
{"handle":"qa-ebab0c6a8f53","displayName":"QA ebab0c6a8f53","password":"****","region":"eu"}

--- response: 201 in 80 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4766692b-84fc-4cc3-b25a-e7e48c1cb933
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-ebab0c6a8f53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8ac3bdf-8940-41e8-bf84-b9d9115435a5","handle":"qa-ebab0c6a8f53","displayName":"QA ebab0c6a8f53","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.317739819Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-bdbf09b6-6487-4062-9d71-3de6fb88478e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbf09b6-6487-4062-9d71-3de6fb88478e
Content-Type: application/json

--- request body ---
{"handle":"qa-e3552f8c5d37","displayName":"QA e3552f8c5d37","password":"****","region":"eu"}

--- response: 201 in 107 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbf09b6-6487-4062-9d71-3de6fb88478e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-e3552f8c5d37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fb33772c-64ea-4db8-a136-e30cc0bca3ff","handle":"qa-e3552f8c5d37","displayName":"QA e3552f8c5d37","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.453726840Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-06dce48b-6b7c-422d-9f53-5e4e8337ea9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06dce48b-6b7c-422d-9f53-5e4e8337ea9a
Content-Type: application/json

--- request body ---
{"handle":"qa-e8869caa747e","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-06dce48b-6b7c-422d-9f53-5e4e8337ea9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7518d056-1655-401b-a1a0-2445b9d5d9b9"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d57366f3-fafd-4213-9c7f-5d5ac9c9f575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d57366f3-fafd-4213-9c7f-5d5ac9c9f575
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ebab0c6a8f53","subject":"Error contract","message":"Hi"}

--- response: 201 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d57366f3-fafd-4213-9c7f-5d5ac9c9f575
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
Location: /v1/conversations/cnv_d2b50fbf-fe73-4754-9e25-0dc4b381b113
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d2b50fbf-fe73-4754-9e25-0dc4b381b113","subject":"Error contract","status":"open","region":"eu","participants":["qa-e8869caa747e","qa-ebab0c6a8f53"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.630792400Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46699bb9-3f4b-460a-ac1b-4ad9472d191e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46699bb9-3f4b-460a-ac1b-4ad9472d191e
Content-Type: application/json

--- request body ---
{"handle":"qa-e3552f8c5d37","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-46699bb9-3f4b-460a-ac1b-4ad9472d191e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb33772c-64ea-4db8-a136-e30cc0bca3ff"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d2b50fbf-fe73-4754-9e25-0dc4b381b113/messages
correlation: qa-e2ab8d94-6a37-4f71-8206-5e0b59708287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ab8d94-6a37-4f71-8206-5e0b59708287
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2ab8d94-6a37-4f71-8206-5e0b59708287
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d2b50fbf-fe73-4754-9e25-0dc4b381b113/messages","correlationId":"qa-e2ab8d94-6a37-4f71-8206-5e0b59708287"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-deb152b2-a125-4d2a-9575-ae90343abc96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deb152b2-a125-4d2a-9575-ae90343abc96
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-deb152b2-a125-4d2a-9575-ae90343abc96
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
correlation: qa-2ac454dc-676e-4b93-88ba-7a4bd1198310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac454dc-676e-4b93-88ba-7a4bd1198310
Content-Type: application/json

--- request body ---
{"handle":"qa-e3552f8c5d37","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ac454dc-676e-4b93-88ba-7a4bd1198310
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ac454dc-676e-4b93-88ba-7a4bd1198310"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-11338efc-2ec7-4eab-9cfb-cc6aa4e96c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11338efc-2ec7-4eab-9cfb-cc6aa4e96c6d
Content-Type: application/json

--- request body ---
{"handle":"qa-ebab0c6a8f53","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-11338efc-2ec7-4eab-9cfb-cc6aa4e96c6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8ac3bdf-8940-41e8-bf84-b9d9115435a5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f61c886-5a12-4354-afea-05d9a3818e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f61c886-5a12-4354-afea-05d9a3818e49
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f61c886-5a12-4354-afea-05d9a3818e49
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
correlation: qa-4f4dc2bc-53bb-4d47-9c2e-3c1e475bbd1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4dc2bc-53bb-4d47-9c2e-3c1e475bbd1a
Content-Type: application/json

--- request body ---
{"handle":"qa-ebab0c6a8f53","password":"****"}

--- response: 401 in 52 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f4dc2bc-53bb-4d47-9c2e-3c1e475bbd1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f4dc2bc-53bb-4d47-9c2e-3c1e475bbd1a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abba2497-4cc3-4a36-8da4-df0eff185d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abba2497-4cc3-4a36-8da4-df0eff185d44
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abba2497-4cc3-4a36-8da4-df0eff185d44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-60fd1eb0-97d9-421a-8d89-ae7a5bd06dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fd1eb0-97d9-421a-8d89-ae7a5bd06dcc
Content-Type: application/json

--- request body ---
{"handle":"qa-e8869caa747e","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60fd1eb0-97d9-421a-8d89-ae7a5bd06dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60fd1eb0-97d9-421a-8d89-ae7a5bd06dcc"}
```
