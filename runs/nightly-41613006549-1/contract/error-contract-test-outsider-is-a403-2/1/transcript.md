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
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-551c0f3f-1cc4-4689-9787-5a0c018ef31b` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-d3924791-2bb3-4076-a8df-c56db8963fc1` |
| 3 | `POST /v1/accounts` | 201 | 35 | `qa-39be3c83-83ea-4526-9d8a-1c0dd32c7782` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-6be7d471-48dd-4ae0-9f35-1d730724d6a5` |
| 5 | `POST /v1/conversations` | 201 | 44 | `qa-3b702345-f35c-4676-ad2d-8df25ee559cd` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-8062791b-8ea5-4cc0-8f4b-612ec1ae3dd3` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 40 | `qa-9bae4db1-fd88-40f1-87a4-904ed55f134f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-fc7d0d68-43cc-4fea-9e88-1f286604c4a7` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-1884d351-b24c-4f67-8bba-e863f900111f` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-55787faa-f7e8-4c86-9413-48ae51e0df24` |
| 11 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-66580ea1-1926-4648-b883-61b71b3ebaa1` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-c34673ad-54a1-4768-885b-0014d7696ce0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a49d7675-4d55-4dad-96c8-96f0f9c3ec82` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-e271bcc9-5384-4004-ae8a-20afa57f9599` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-551c0f3f-1cc4-4689-9787-5a0c018ef31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-551c0f3f-1cc4-4689-9787-5a0c018ef31b
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1b6e42f6d1","displayName":"QA 0c1b6e42f6d1","password":"****","region":"eu"}

--- response: 201 in 372 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-551c0f3f-1cc4-4689-9787-5a0c018ef31b
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
Location: /v1/accounts/qa-0c1b6e42f6d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d7cd89c-55d3-47c3-b005-f7415f4435dc","handle":"qa-0c1b6e42f6d1","displayName":"QA 0c1b6e42f6d1","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.849066853Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d3924791-2bb3-4076-a8df-c56db8963fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3924791-2bb3-4076-a8df-c56db8963fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-39b79e142813","displayName":"QA 39b79e142813","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3924791-2bb3-4076-a8df-c56db8963fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-39b79e142813
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f7af1bb-d345-4d94-8056-d5cc61a5137e","handle":"qa-39b79e142813","displayName":"QA 39b79e142813","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.239349056Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-39be3c83-83ea-4526-9d8a-1c0dd32c7782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39be3c83-83ea-4526-9d8a-1c0dd32c7782
Content-Type: application/json

--- request body ---
{"handle":"qa-7c29f5ddd7bb","displayName":"QA 7c29f5ddd7bb","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-39be3c83-83ea-4526-9d8a-1c0dd32c7782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-7c29f5ddd7bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc43706d-23fb-410a-97e4-2dbd777d4877","handle":"qa-7c29f5ddd7bb","displayName":"QA 7c29f5ddd7bb","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.282814169Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6be7d471-48dd-4ae0-9f35-1d730724d6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6be7d471-48dd-4ae0-9f35-1d730724d6a5
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1b6e42f6d1","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6be7d471-48dd-4ae0-9f35-1d730724d6a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d7cd89c-55d3-47c3-b005-f7415f4435dc"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3b702345-f35c-4676-ad2d-8df25ee559cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b702345-f35c-4676-ad2d-8df25ee559cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-39b79e142813","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b702345-f35c-4676-ad2d-8df25ee559cd
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
Location: /v1/conversations/cnv_c6a43bcb-b6f3-4cd9-b864-b812f74a5257
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c6a43bcb-b6f3-4cd9-b864-b812f74a5257","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c1b6e42f6d1","qa-39b79e142813"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.407978510Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8062791b-8ea5-4cc0-8f4b-612ec1ae3dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8062791b-8ea5-4cc0-8f4b-612ec1ae3dd3
Content-Type: application/json

--- request body ---
{"handle":"qa-7c29f5ddd7bb","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8062791b-8ea5-4cc0-8f4b-612ec1ae3dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc43706d-23fb-410a-97e4-2dbd777d4877"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c6a43bcb-b6f3-4cd9-b864-b812f74a5257/messages
correlation: qa-9bae4db1-fd88-40f1-87a4-904ed55f134f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bae4db1-fd88-40f1-87a4-904ed55f134f
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 40 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bae4db1-fd88-40f1-87a4-904ed55f134f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c6a43bcb-b6f3-4cd9-b864-b812f74a5257/messages","correlationId":"qa-9bae4db1-fd88-40f1-87a4-904ed55f134f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc7d0d68-43cc-4fea-9e88-1f286604c4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc7d0d68-43cc-4fea-9e88-1f286604c4a7
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc7d0d68-43cc-4fea-9e88-1f286604c4a7
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
correlation: qa-1884d351-b24c-4f67-8bba-e863f900111f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1884d351-b24c-4f67-8bba-e863f900111f
Content-Type: application/json

--- request body ---
{"handle":"qa-7c29f5ddd7bb","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1884d351-b24c-4f67-8bba-e863f900111f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1884d351-b24c-4f67-8bba-e863f900111f"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-55787faa-f7e8-4c86-9413-48ae51e0df24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55787faa-f7e8-4c86-9413-48ae51e0df24
Content-Type: application/json

--- request body ---
{"handle":"qa-39b79e142813","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-55787faa-f7e8-4c86-9413-48ae51e0df24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f7af1bb-d345-4d94-8056-d5cc61a5137e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66580ea1-1926-4648-b883-61b71b3ebaa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66580ea1-1926-4648-b883-61b71b3ebaa1
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66580ea1-1926-4648-b883-61b71b3ebaa1
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
correlation: qa-c34673ad-54a1-4768-885b-0014d7696ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34673ad-54a1-4768-885b-0014d7696ce0
Content-Type: application/json

--- request body ---
{"handle":"qa-39b79e142813","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c34673ad-54a1-4768-885b-0014d7696ce0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c34673ad-54a1-4768-885b-0014d7696ce0"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a49d7675-4d55-4dad-96c8-96f0f9c3ec82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a49d7675-4d55-4dad-96c8-96f0f9c3ec82
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a49d7675-4d55-4dad-96c8-96f0f9c3ec82
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
correlation: qa-e271bcc9-5384-4004-ae8a-20afa57f9599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e271bcc9-5384-4004-ae8a-20afa57f9599
Content-Type: application/json

--- request body ---
{"handle":"qa-0c1b6e42f6d1","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e271bcc9-5384-4004-ae8a-20afa57f9599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e271bcc9-5384-4004-ae8a-20afa57f9599"}
```
