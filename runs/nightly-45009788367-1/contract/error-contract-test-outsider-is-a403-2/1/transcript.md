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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-81cf4a11-34b6-4c43-bdfe-e106828dbd42` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-84886260-4fdb-434c-9f09-84d9a1e2b274` |
| 3 | `POST /v1/accounts` | 201 | 28 | `qa-999169f7-8def-4642-a768-13e06a75879d` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-94f654a1-c009-425f-b6f3-4878559fe269` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-c5ccc0ab-1f75-44e1-944e-94f502503d10` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-074cb4c8-7448-40f0-ae4c-06099917de14` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-ddfac61d-4e04-425d-b3c0-7722976a9b02` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5f2d837c-4e0b-4a37-9141-236f5e203772` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-f3f8c9e2-613f-453e-9ecf-acd41819981c` |
| 10 | `POST /v1/auth/token` | 200 | 25 | `qa-c5cc85d3-4e0b-4f57-bab5-43046fe8c6d9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-468368ea-50d7-4ded-abf3-a071d5fd30e5` |
| 12 | `POST /v1/auth/token` | 401 | 15 | `qa-78e3ab54-88dd-413f-9819-82a0ecb31556` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-8a9fd6da-1d83-4db8-be2b-6de622c02df3` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-defdbf13-6742-46d7-89c4-735008433761` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81cf4a11-34b6-4c43-bdfe-e106828dbd42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81cf4a11-34b6-4c43-bdfe-e106828dbd42
Content-Type: application/json

--- request body ---
{"handle":"qa-77c434e9b603","displayName":"QA 77c434e9b603","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-81cf4a11-34b6-4c43-bdfe-e106828dbd42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Location: /v1/accounts/qa-77c434e9b603
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cf1dbb2-fca8-4cb0-9136-a5e6a31afd82","handle":"qa-77c434e9b603","displayName":"QA 77c434e9b603","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.531427766Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-84886260-4fdb-434c-9f09-84d9a1e2b274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84886260-4fdb-434c-9f09-84d9a1e2b274
Content-Type: application/json

--- request body ---
{"handle":"qa-65cdbadd68bd","displayName":"QA 65cdbadd68bd","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-84886260-4fdb-434c-9f09-84d9a1e2b274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Location: /v1/accounts/qa-65cdbadd68bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0946180c-73b6-441d-bb51-1226763ee969","handle":"qa-65cdbadd68bd","displayName":"QA 65cdbadd68bd","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.546197797Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-999169f7-8def-4642-a768-13e06a75879d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999169f7-8def-4642-a768-13e06a75879d
Content-Type: application/json

--- request body ---
{"handle":"qa-40831da92f30","displayName":"QA 40831da92f30","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-999169f7-8def-4642-a768-13e06a75879d
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
Location: /v1/accounts/qa-40831da92f30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_675f5d9e-0097-4cb5-af31-67cc1bcd55ac","handle":"qa-40831da92f30","displayName":"QA 40831da92f30","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.575983912Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-94f654a1-c009-425f-b6f3-4878559fe269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f654a1-c009-425f-b6f3-4878559fe269
Content-Type: application/json

--- request body ---
{"handle":"qa-77c434e9b603","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-94f654a1-c009-425f-b6f3-4878559fe269
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cf1dbb2-fca8-4cb0-9136-a5e6a31afd82"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c5ccc0ab-1f75-44e1-944e-94f502503d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5ccc0ab-1f75-44e1-944e-94f502503d10
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65cdbadd68bd","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5ccc0ab-1f75-44e1-944e-94f502503d10
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
Location: /v1/conversations/cnv_d7f50909-c3f2-413c-a17b-3e0791cdf557
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d7f50909-c3f2-413c-a17b-3e0791cdf557","subject":"Error contract","status":"open","region":"eu","participants":["qa-77c434e9b603","qa-65cdbadd68bd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.625270372Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-074cb4c8-7448-40f0-ae4c-06099917de14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074cb4c8-7448-40f0-ae4c-06099917de14
Content-Type: application/json

--- request body ---
{"handle":"qa-40831da92f30","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-074cb4c8-7448-40f0-ae4c-06099917de14
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_675f5d9e-0097-4cb5-af31-67cc1bcd55ac"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d7f50909-c3f2-413c-a17b-3e0791cdf557/messages
correlation: qa-ddfac61d-4e04-425d-b3c0-7722976a9b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddfac61d-4e04-425d-b3c0-7722976a9b02
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddfac61d-4e04-425d-b3c0-7722976a9b02
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d7f50909-c3f2-413c-a17b-3e0791cdf557/messages","correlationId":"qa-ddfac61d-4e04-425d-b3c0-7722976a9b02"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f2d837c-4e0b-4a37-9141-236f5e203772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f2d837c-4e0b-4a37-9141-236f5e203772
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f2d837c-4e0b-4a37-9141-236f5e203772
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
correlation: qa-f3f8c9e2-613f-453e-9ecf-acd41819981c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f8c9e2-613f-453e-9ecf-acd41819981c
Content-Type: application/json

--- request body ---
{"handle":"qa-40831da92f30","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3f8c9e2-613f-453e-9ecf-acd41819981c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3f8c9e2-613f-453e-9ecf-acd41819981c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c5cc85d3-4e0b-4f57-bab5-43046fe8c6d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5cc85d3-4e0b-4f57-bab5-43046fe8c6d9
Content-Type: application/json

--- request body ---
{"handle":"qa-65cdbadd68bd","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5cc85d3-4e0b-4f57-bab5-43046fe8c6d9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0946180c-73b6-441d-bb51-1226763ee969"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-468368ea-50d7-4ded-abf3-a071d5fd30e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-468368ea-50d7-4ded-abf3-a071d5fd30e5
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-468368ea-50d7-4ded-abf3-a071d5fd30e5
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
correlation: qa-78e3ab54-88dd-413f-9819-82a0ecb31556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78e3ab54-88dd-413f-9819-82a0ecb31556
Content-Type: application/json

--- request body ---
{"handle":"qa-65cdbadd68bd","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78e3ab54-88dd-413f-9819-82a0ecb31556
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78e3ab54-88dd-413f-9819-82a0ecb31556"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a9fd6da-1d83-4db8-be2b-6de622c02df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a9fd6da-1d83-4db8-be2b-6de622c02df3
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a9fd6da-1d83-4db8-be2b-6de622c02df3
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
correlation: qa-defdbf13-6742-46d7-89c4-735008433761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-defdbf13-6742-46d7-89c4-735008433761
Content-Type: application/json

--- request body ---
{"handle":"qa-77c434e9b603","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-defdbf13-6742-46d7-89c4-735008433761
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-defdbf13-6742-46d7-89c4-735008433761"}
```
