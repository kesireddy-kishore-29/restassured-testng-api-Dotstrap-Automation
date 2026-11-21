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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-82156f79-be02-4c36-b735-4352296ff420` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-c053158d-125b-4fa0-b0b4-888dc235e9da` |
| 3 | `POST /v1/accounts` | 201 | 50 | `qa-1d47ae96-57da-4a9d-bd6f-4ca988dd916d` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-c0f5df1e-b3a6-455e-8f8e-832b8add7bcb` |
| 5 | `POST /v1/conversations` | 201 | 19 | `qa-b8cb7a27-fbc3-4c43-8295-4768f9692179` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-d9ab02f9-5897-4b40-9c2c-53c75684f614` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 25 | `qa-af4f621b-498d-4400-9a49-b777d57b933a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-7ea37093-b074-40d3-946e-a50332a23b86` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-758b79b7-f8e4-471d-ad67-e85609d67b86` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-d528f7bd-72f1-47aa-b5e1-ed555a406fa8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d9dc9a26-fb63-43a7-b272-fac04ae72147` |
| 12 | `POST /v1/auth/token` | 401 | 51 | `qa-10304693-db8b-4c6e-8dc4-5f248bce9708` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fbd795a3-dda7-4eae-8e09-c219f3e3a105` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-60c72ca8-4862-485e-a287-3baf5af8980c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82156f79-be02-4c36-b735-4352296ff420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82156f79-be02-4c36-b735-4352296ff420
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e3058d5cac","displayName":"QA f2e3058d5cac","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-82156f79-be02-4c36-b735-4352296ff420
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
Location: /v1/accounts/qa-f2e3058d5cac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b24d5a9-2bd2-4819-9ae4-104a43693009","handle":"qa-f2e3058d5cac","displayName":"QA f2e3058d5cac","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.807284543Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c053158d-125b-4fa0-b0b4-888dc235e9da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c053158d-125b-4fa0-b0b4-888dc235e9da
Content-Type: application/json

--- request body ---
{"handle":"qa-fec79b765546","displayName":"QA fec79b765546","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c053158d-125b-4fa0-b0b4-888dc235e9da
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
Location: /v1/accounts/qa-fec79b765546
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9310c8ce-956c-4fcc-a5ca-8e6591c7d4db","handle":"qa-fec79b765546","displayName":"QA fec79b765546","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.860531701Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1d47ae96-57da-4a9d-bd6f-4ca988dd916d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d47ae96-57da-4a9d-bd6f-4ca988dd916d
Content-Type: application/json

--- request body ---
{"handle":"qa-af1fb1b471a6","displayName":"QA af1fb1b471a6","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d47ae96-57da-4a9d-bd6f-4ca988dd916d
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
Location: /v1/accounts/qa-af1fb1b471a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a64b2b0-84d8-4e6d-8a8b-4bd328f09c65","handle":"qa-af1fb1b471a6","displayName":"QA af1fb1b471a6","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.917719546Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c0f5df1e-b3a6-455e-8f8e-832b8add7bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0f5df1e-b3a6-455e-8f8e-832b8add7bcb
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e3058d5cac","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0f5df1e-b3a6-455e-8f8e-832b8add7bcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b24d5a9-2bd2-4819-9ae4-104a43693009"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b8cb7a27-fbc3-4c43-8295-4768f9692179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8cb7a27-fbc3-4c43-8295-4768f9692179
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fec79b765546","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8cb7a27-fbc3-4c43-8295-4768f9692179
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
Location: /v1/conversations/cnv_acc50b83-ee26-495a-bc3e-cb4507d410d0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_acc50b83-ee26-495a-bc3e-cb4507d410d0","subject":"Error contract","status":"open","region":"eu","participants":["qa-f2e3058d5cac","qa-fec79b765546"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:06.005549495Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d9ab02f9-5897-4b40-9c2c-53c75684f614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ab02f9-5897-4b40-9c2c-53c75684f614
Content-Type: application/json

--- request body ---
{"handle":"qa-af1fb1b471a6","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9ab02f9-5897-4b40-9c2c-53c75684f614
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a64b2b0-84d8-4e6d-8a8b-4bd328f09c65"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_acc50b83-ee26-495a-bc3e-cb4507d410d0/messages
correlation: qa-af4f621b-498d-4400-9a49-b777d57b933a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af4f621b-498d-4400-9a49-b777d57b933a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af4f621b-498d-4400-9a49-b777d57b933a
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_acc50b83-ee26-495a-bc3e-cb4507d410d0/messages","correlationId":"qa-af4f621b-498d-4400-9a49-b777d57b933a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ea37093-b074-40d3-946e-a50332a23b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea37093-b074-40d3-946e-a50332a23b86
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ea37093-b074-40d3-946e-a50332a23b86
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
correlation: qa-758b79b7-f8e4-471d-ad67-e85609d67b86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758b79b7-f8e4-471d-ad67-e85609d67b86
Content-Type: application/json

--- request body ---
{"handle":"qa-af1fb1b471a6","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-758b79b7-f8e4-471d-ad67-e85609d67b86
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-758b79b7-f8e4-471d-ad67-e85609d67b86"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d528f7bd-72f1-47aa-b5e1-ed555a406fa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d528f7bd-72f1-47aa-b5e1-ed555a406fa8
Content-Type: application/json

--- request body ---
{"handle":"qa-fec79b765546","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d528f7bd-72f1-47aa-b5e1-ed555a406fa8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9310c8ce-956c-4fcc-a5ca-8e6591c7d4db"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d9dc9a26-fb63-43a7-b272-fac04ae72147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9dc9a26-fb63-43a7-b272-fac04ae72147
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d9dc9a26-fb63-43a7-b272-fac04ae72147
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
correlation: qa-10304693-db8b-4c6e-8dc4-5f248bce9708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10304693-db8b-4c6e-8dc4-5f248bce9708
Content-Type: application/json

--- request body ---
{"handle":"qa-fec79b765546","password":"****"}

--- response: 401 in 51 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10304693-db8b-4c6e-8dc4-5f248bce9708
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10304693-db8b-4c6e-8dc4-5f248bce9708"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbd795a3-dda7-4eae-8e09-c219f3e3a105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbd795a3-dda7-4eae-8e09-c219f3e3a105
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbd795a3-dda7-4eae-8e09-c219f3e3a105
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
correlation: qa-60c72ca8-4862-485e-a287-3baf5af8980c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c72ca8-4862-485e-a287-3baf5af8980c
Content-Type: application/json

--- request body ---
{"handle":"qa-f2e3058d5cac","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60c72ca8-4862-485e-a287-3baf5af8980c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60c72ca8-4862-485e-a287-3baf5af8980c"}
```
