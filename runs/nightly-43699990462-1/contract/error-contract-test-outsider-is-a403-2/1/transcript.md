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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-e4f75922-8734-49fd-b7cd-94c3cf568353` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-e30ceff6-2d46-43af-accd-1a0f263d3c1a` |
| 3 | `POST /v1/accounts` | 201 | 35 | `qa-54e55e76-8273-4ad5-97fa-f7322ff32b86` |
| 4 | `POST /v1/auth/token` | 200 | 29 | `qa-29f97517-9add-4d2c-9736-700e00f104ee` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-2da6f8e6-8601-42fd-a4a6-0bae48386ae2` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-1f633ff0-8580-4aad-938b-9ab054d23065` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 9 | `qa-164321ec-131a-462f-8a7e-ccafd16d3349` |
| 8 | `DELETE /v1/accounts/me` | 204 | 61 | `qa-82a56871-bde9-4e17-b799-c293a1211e65` |
| 9 | `POST /v1/auth/token` | 401 | 61 | `qa-22adbf20-2ee8-42dd-9e6e-11eeb97da559` |
| 10 | `POST /v1/auth/token` | 200 | 33 | `qa-f844906a-300d-42d1-87d9-723c707cbee4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d650ccd1-3ed7-400f-8127-8d0fc93e6c98` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-fea1a78e-767f-403d-a712-46c433bb7766` |
| 13 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-b2ae2872-8ce5-4801-a393-b8e73d060625` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-a623b180-e2d8-4866-9040-6dcb3fdc72f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4f75922-8734-49fd-b7cd-94c3cf568353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4f75922-8734-49fd-b7cd-94c3cf568353
Content-Type: application/json

--- request body ---
{"handle":"qa-19923cc9e762","displayName":"QA 19923cc9e762","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4f75922-8734-49fd-b7cd-94c3cf568353
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-19923cc9e762
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc7bd1a7-1ed4-445e-b94b-99f847f61c9c","handle":"qa-19923cc9e762","displayName":"QA 19923cc9e762","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.261435103Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e30ceff6-2d46-43af-accd-1a0f263d3c1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30ceff6-2d46-43af-accd-1a0f263d3c1a
Content-Type: application/json

--- request body ---
{"handle":"qa-c16af81830c2","displayName":"QA c16af81830c2","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e30ceff6-2d46-43af-accd-1a0f263d3c1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-c16af81830c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_826eafb9-8893-4be5-93f2-2ba885a6d15b","handle":"qa-c16af81830c2","displayName":"QA c16af81830c2","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.292195130Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-54e55e76-8273-4ad5-97fa-f7322ff32b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54e55e76-8273-4ad5-97fa-f7322ff32b86
Content-Type: application/json

--- request body ---
{"handle":"qa-492a5a73e9e7","displayName":"QA 492a5a73e9e7","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-54e55e76-8273-4ad5-97fa-f7322ff32b86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-492a5a73e9e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd240bd4-66d2-4168-9ae9-858253443052","handle":"qa-492a5a73e9e7","displayName":"QA 492a5a73e9e7","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.339709562Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-29f97517-9add-4d2c-9736-700e00f104ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f97517-9add-4d2c-9736-700e00f104ee
Content-Type: application/json

--- request body ---
{"handle":"qa-19923cc9e762","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-29f97517-9add-4d2c-9736-700e00f104ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc7bd1a7-1ed4-445e-b94b-99f847f61c9c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2da6f8e6-8601-42fd-a4a6-0bae48386ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da6f8e6-8601-42fd-a4a6-0bae48386ae2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c16af81830c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da6f8e6-8601-42fd-a4a6-0bae48386ae2
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
Location: /v1/conversations/cnv_909a8ead-5ece-4dd8-9bc1-97e25a61a917
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_909a8ead-5ece-4dd8-9bc1-97e25a61a917","subject":"Error contract","status":"open","region":"eu","participants":["qa-19923cc9e762","qa-c16af81830c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.424233845Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f633ff0-8580-4aad-938b-9ab054d23065

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f633ff0-8580-4aad-938b-9ab054d23065
Content-Type: application/json

--- request body ---
{"handle":"qa-492a5a73e9e7","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f633ff0-8580-4aad-938b-9ab054d23065
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd240bd4-66d2-4168-9ae9-858253443052"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_909a8ead-5ece-4dd8-9bc1-97e25a61a917/messages
correlation: qa-164321ec-131a-462f-8a7e-ccafd16d3349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164321ec-131a-462f-8a7e-ccafd16d3349
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-164321ec-131a-462f-8a7e-ccafd16d3349
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_909a8ead-5ece-4dd8-9bc1-97e25a61a917/messages","correlationId":"qa-164321ec-131a-462f-8a7e-ccafd16d3349"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82a56871-bde9-4e17-b799-c293a1211e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82a56871-bde9-4e17-b799-c293a1211e65
Content-Type: application/json

--- response: 204 in 61 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82a56871-bde9-4e17-b799-c293a1211e65
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
correlation: qa-22adbf20-2ee8-42dd-9e6e-11eeb97da559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22adbf20-2ee8-42dd-9e6e-11eeb97da559
Content-Type: application/json

--- request body ---
{"handle":"qa-492a5a73e9e7","password":"****"}

--- response: 401 in 61 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22adbf20-2ee8-42dd-9e6e-11eeb97da559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22adbf20-2ee8-42dd-9e6e-11eeb97da559"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f844906a-300d-42d1-87d9-723c707cbee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f844906a-300d-42d1-87d9-723c707cbee4
Content-Type: application/json

--- request body ---
{"handle":"qa-c16af81830c2","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f844906a-300d-42d1-87d9-723c707cbee4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_826eafb9-8893-4be5-93f2-2ba885a6d15b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d650ccd1-3ed7-400f-8127-8d0fc93e6c98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d650ccd1-3ed7-400f-8127-8d0fc93e6c98
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d650ccd1-3ed7-400f-8127-8d0fc93e6c98
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
correlation: qa-fea1a78e-767f-403d-a712-46c433bb7766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fea1a78e-767f-403d-a712-46c433bb7766
Content-Type: application/json

--- request body ---
{"handle":"qa-c16af81830c2","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fea1a78e-767f-403d-a712-46c433bb7766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fea1a78e-767f-403d-a712-46c433bb7766"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2ae2872-8ce5-4801-a393-b8e73d060625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ae2872-8ce5-4801-a393-b8e73d060625
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2ae2872-8ce5-4801-a393-b8e73d060625
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
correlation: qa-a623b180-e2d8-4866-9040-6dcb3fdc72f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a623b180-e2d8-4866-9040-6dcb3fdc72f2
Content-Type: application/json

--- request body ---
{"handle":"qa-19923cc9e762","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a623b180-e2d8-4866-9040-6dcb3fdc72f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a623b180-e2d8-4866-9040-6dcb3fdc72f2"}
```
