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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-0b1a7096-166b-4d92-98a1-8e4207896487` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-4e08fdf6-87bb-4c20-b46e-6f7051e3a05c` |
| 3 | `POST /v1/accounts` | 201 | 33 | `qa-465ff644-2e87-4992-b8fe-5b04dd5a0cf5` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-1763f730-53dc-448d-b643-f6b8d53bedde` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-389908fe-f834-427a-8043-b5d5b2d84d12` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-b6df0fc4-d6b0-45e0-8f67-3d6fd36b7723` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 26 | `qa-754546f4-c6df-41d1-8516-1f2c14d7cc18` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-19d331a3-1f6f-4076-aaad-66792d113f80` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-2ebb3d34-9494-4df0-a78a-e13c5c7f07a6` |
| 10 | `POST /v1/auth/token` | 200 | 49 | `qa-a7220bee-a862-400b-bb16-3f76a6d312b1` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-9b407bb0-46f3-48a8-a8a2-6fe70e9fce3a` |
| 12 | `POST /v1/auth/token` | 401 | 32 | `qa-a1429fe2-5974-4cb2-a3ec-3efcef51b905` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-dea28bc0-6067-4007-a63d-96f52d221115` |
| 14 | `POST /v1/auth/token` | 401 | 56 | `qa-db180011-ea75-442e-a701-d13bc97d932e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b1a7096-166b-4d92-98a1-8e4207896487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1a7096-166b-4d92-98a1-8e4207896487
Content-Type: application/json

--- request body ---
{"handle":"qa-e014d24ad52d","displayName":"QA e014d24ad52d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b1a7096-166b-4d92-98a1-8e4207896487
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
Location: /v1/accounts/qa-e014d24ad52d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f82e6a3-8d07-4c76-83b9-35d004dd7d3c","handle":"qa-e014d24ad52d","displayName":"QA e014d24ad52d","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.978637491Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e08fdf6-87bb-4c20-b46e-6f7051e3a05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e08fdf6-87bb-4c20-b46e-6f7051e3a05c
Content-Type: application/json

--- request body ---
{"handle":"qa-b0aa85e927db","displayName":"QA b0aa85e927db","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e08fdf6-87bb-4c20-b46e-6f7051e3a05c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-b0aa85e927db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f803f48d-913f-4811-b89e-51c4bc02ef5e","handle":"qa-b0aa85e927db","displayName":"QA b0aa85e927db","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.022548573Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-465ff644-2e87-4992-b8fe-5b04dd5a0cf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-465ff644-2e87-4992-b8fe-5b04dd5a0cf5
Content-Type: application/json

--- request body ---
{"handle":"qa-75f9e34c2414","displayName":"QA 75f9e34c2414","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-465ff644-2e87-4992-b8fe-5b04dd5a0cf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-75f9e34c2414
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13b3d0fa-c407-4900-b39a-39ed6f74781a","handle":"qa-75f9e34c2414","displayName":"QA 75f9e34c2414","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.073182715Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1763f730-53dc-448d-b643-f6b8d53bedde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1763f730-53dc-448d-b643-f6b8d53bedde
Content-Type: application/json

--- request body ---
{"handle":"qa-e014d24ad52d","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-1763f730-53dc-448d-b643-f6b8d53bedde
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f82e6a3-8d07-4c76-83b9-35d004dd7d3c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-389908fe-f834-427a-8043-b5d5b2d84d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-389908fe-f834-427a-8043-b5d5b2d84d12
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b0aa85e927db","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-389908fe-f834-427a-8043-b5d5b2d84d12
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
Location: /v1/conversations/cnv_59d3a0db-c4cd-4e2e-83a6-2ddd0f92adc8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59d3a0db-c4cd-4e2e-83a6-2ddd0f92adc8","subject":"Error contract","status":"open","region":"eu","participants":["qa-e014d24ad52d","qa-b0aa85e927db"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:44.141466698Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b6df0fc4-d6b0-45e0-8f67-3d6fd36b7723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6df0fc4-d6b0-45e0-8f67-3d6fd36b7723
Content-Type: application/json

--- request body ---
{"handle":"qa-75f9e34c2414","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6df0fc4-d6b0-45e0-8f67-3d6fd36b7723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13b3d0fa-c407-4900-b39a-39ed6f74781a"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_59d3a0db-c4cd-4e2e-83a6-2ddd0f92adc8/read
correlation: qa-754546f4-c6df-41d1-8516-1f2c14d7cc18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754546f4-c6df-41d1-8516-1f2c14d7cc18
Content-Type: application/json

--- response: 403 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-754546f4-c6df-41d1-8516-1f2c14d7cc18
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_59d3a0db-c4cd-4e2e-83a6-2ddd0f92adc8/read","correlationId":"qa-754546f4-c6df-41d1-8516-1f2c14d7cc18"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19d331a3-1f6f-4076-aaad-66792d113f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d331a3-1f6f-4076-aaad-66792d113f80
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19d331a3-1f6f-4076-aaad-66792d113f80
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
correlation: qa-2ebb3d34-9494-4df0-a78a-e13c5c7f07a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ebb3d34-9494-4df0-a78a-e13c5c7f07a6
Content-Type: application/json

--- request body ---
{"handle":"qa-75f9e34c2414","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ebb3d34-9494-4df0-a78a-e13c5c7f07a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ebb3d34-9494-4df0-a78a-e13c5c7f07a6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a7220bee-a862-400b-bb16-3f76a6d312b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7220bee-a862-400b-bb16-3f76a6d312b1
Content-Type: application/json

--- request body ---
{"handle":"qa-b0aa85e927db","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7220bee-a862-400b-bb16-3f76a6d312b1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f803f48d-913f-4811-b89e-51c4bc02ef5e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b407bb0-46f3-48a8-a8a2-6fe70e9fce3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b407bb0-46f3-48a8-a8a2-6fe70e9fce3a
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b407bb0-46f3-48a8-a8a2-6fe70e9fce3a
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
correlation: qa-a1429fe2-5974-4cb2-a3ec-3efcef51b905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1429fe2-5974-4cb2-a3ec-3efcef51b905
Content-Type: application/json

--- request body ---
{"handle":"qa-b0aa85e927db","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1429fe2-5974-4cb2-a3ec-3efcef51b905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1429fe2-5974-4cb2-a3ec-3efcef51b905"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dea28bc0-6067-4007-a63d-96f52d221115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea28bc0-6067-4007-a63d-96f52d221115
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dea28bc0-6067-4007-a63d-96f52d221115
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
correlation: qa-db180011-ea75-442e-a701-d13bc97d932e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db180011-ea75-442e-a701-d13bc97d932e
Content-Type: application/json

--- request body ---
{"handle":"qa-e014d24ad52d","password":"****"}

--- response: 401 in 56 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db180011-ea75-442e-a701-d13bc97d932e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db180011-ea75-442e-a701-d13bc97d932e"}
```
