# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-c980947a-4eaf-4d2c-ae74-867e66948452` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-eede0035-49ae-4696-8ecc-873434a7db5d` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-ec9d4967-05df-4c6f-8b01-435483ca2631` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-b17d985e-d074-4169-b555-def54a204210` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-c008ac73-7cba-4a9f-abcb-0d76a88075c8` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-cdc613d6-4e7b-43e2-a1cc-4b63a3778617` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 11 | `qa-f44b3e2f-e624-4fae-8a33-bbe01e703b88` |
| 8 | `DELETE /v1/accounts/me` | 204 | 68 | `qa-bcbf205b-6fe1-4f83-8da1-075c814c9fe4` |
| 9 | `POST /v1/auth/token` | 401 | 28 | `qa-64abd74f-47a4-4b2e-be87-a76c2acd2aa6` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-3460ce74-fa13-4751-a6e3-62d2f9eec524` |
| 11 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-d5d3c7c2-fc9b-4c77-8a4d-c12d8e6d181a` |
| 12 | `POST /v1/auth/token` | 401 | 31 | `qa-a5d6c846-c437-4da0-9f97-fcde6de063a1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-7d3247ae-d3a8-47b6-8241-d03cacd6d825` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-c59b5fe2-cfd9-4252-83af-5a6e67face0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c980947a-4eaf-4d2c-ae74-867e66948452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c980947a-4eaf-4d2c-ae74-867e66948452
Content-Type: application/json

--- request body ---
{"handle":"qa-59656205e6b6","displayName":"QA 59656205e6b6","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c980947a-4eaf-4d2c-ae74-867e66948452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-59656205e6b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4707de73-fc37-461b-b4cf-8deb826c46ac","handle":"qa-59656205e6b6","displayName":"QA 59656205e6b6","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.865769426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eede0035-49ae-4696-8ecc-873434a7db5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eede0035-49ae-4696-8ecc-873434a7db5d
Content-Type: application/json

--- request body ---
{"handle":"qa-8a4b37542562","displayName":"QA 8a4b37542562","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-eede0035-49ae-4696-8ecc-873434a7db5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-8a4b37542562
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edbf1fd5-8948-41f0-85a4-755ee7ed4bd3","handle":"qa-8a4b37542562","displayName":"QA 8a4b37542562","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.889412389Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ec9d4967-05df-4c6f-8b01-435483ca2631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec9d4967-05df-4c6f-8b01-435483ca2631
Content-Type: application/json

--- request body ---
{"handle":"qa-e4f889dbd248","displayName":"QA e4f889dbd248","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec9d4967-05df-4c6f-8b01-435483ca2631
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
Location: /v1/accounts/qa-e4f889dbd248
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58c8f9ea-7264-43c2-9527-261a43a77266","handle":"qa-e4f889dbd248","displayName":"QA e4f889dbd248","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.927013486Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b17d985e-d074-4169-b555-def54a204210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17d985e-d074-4169-b555-def54a204210
Content-Type: application/json

--- request body ---
{"handle":"qa-59656205e6b6","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17d985e-d074-4169-b555-def54a204210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4707de73-fc37-461b-b4cf-8deb826c46ac"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c008ac73-7cba-4a9f-abcb-0d76a88075c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c008ac73-7cba-4a9f-abcb-0d76a88075c8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a4b37542562","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c008ac73-7cba-4a9f-abcb-0d76a88075c8
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
Location: /v1/conversations/cnv_683e3172-1ed4-4127-94e3-c70b0d9a3074
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_683e3172-1ed4-4127-94e3-c70b0d9a3074","subject":"Error contract","status":"open","region":"eu","participants":["qa-59656205e6b6","qa-8a4b37542562"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.992684418Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cdc613d6-4e7b-43e2-a1cc-4b63a3778617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc613d6-4e7b-43e2-a1cc-4b63a3778617
Content-Type: application/json

--- request body ---
{"handle":"qa-e4f889dbd248","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc613d6-4e7b-43e2-a1cc-4b63a3778617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58c8f9ea-7264-43c2-9527-261a43a77266"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_683e3172-1ed4-4127-94e3-c70b0d9a3074/read
correlation: qa-f44b3e2f-e624-4fae-8a33-bbe01e703b88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44b3e2f-e624-4fae-8a33-bbe01e703b88
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f44b3e2f-e624-4fae-8a33-bbe01e703b88
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_683e3172-1ed4-4127-94e3-c70b0d9a3074/read","correlationId":"qa-f44b3e2f-e624-4fae-8a33-bbe01e703b88"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcbf205b-6fe1-4f83-8da1-075c814c9fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcbf205b-6fe1-4f83-8da1-075c814c9fe4
Content-Type: application/json

--- response: 204 in 68 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcbf205b-6fe1-4f83-8da1-075c814c9fe4
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
correlation: qa-64abd74f-47a4-4b2e-be87-a76c2acd2aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64abd74f-47a4-4b2e-be87-a76c2acd2aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-e4f889dbd248","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64abd74f-47a4-4b2e-be87-a76c2acd2aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64abd74f-47a4-4b2e-be87-a76c2acd2aa6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3460ce74-fa13-4751-a6e3-62d2f9eec524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3460ce74-fa13-4751-a6e3-62d2f9eec524
Content-Type: application/json

--- request body ---
{"handle":"qa-8a4b37542562","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3460ce74-fa13-4751-a6e3-62d2f9eec524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edbf1fd5-8948-41f0-85a4-755ee7ed4bd3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5d3c7c2-fc9b-4c77-8a4d-c12d8e6d181a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5d3c7c2-fc9b-4c77-8a4d-c12d8e6d181a
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5d3c7c2-fc9b-4c77-8a4d-c12d8e6d181a
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
correlation: qa-a5d6c846-c437-4da0-9f97-fcde6de063a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5d6c846-c437-4da0-9f97-fcde6de063a1
Content-Type: application/json

--- request body ---
{"handle":"qa-8a4b37542562","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5d6c846-c437-4da0-9f97-fcde6de063a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5d6c846-c437-4da0-9f97-fcde6de063a1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d3247ae-d3a8-47b6-8241-d03cacd6d825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d3247ae-d3a8-47b6-8241-d03cacd6d825
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d3247ae-d3a8-47b6-8241-d03cacd6d825
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
correlation: qa-c59b5fe2-cfd9-4252-83af-5a6e67face0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59b5fe2-cfd9-4252-83af-5a6e67face0e
Content-Type: application/json

--- request body ---
{"handle":"qa-59656205e6b6","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c59b5fe2-cfd9-4252-83af-5a6e67face0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c59b5fe2-cfd9-4252-83af-5a6e67face0e"}
```
