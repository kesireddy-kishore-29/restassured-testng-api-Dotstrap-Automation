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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-2aca3c20-9eae-465b-8d62-8361fe0fdf64` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-a3b872d2-76e6-4770-bb42-15ac9ef766fa` |
| 3 | `POST /v1/accounts` | 201 | 18 | `qa-5c197a05-a07e-4a78-add9-bd54b6178a04` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-c768c10b-304a-4fc2-a08b-b2f5a0e0d7f6` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-58a1d7fe-eb09-4d7e-8005-68fc53f4187d` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-64d2d114-535c-49d2-94d8-f1dbc2d46127` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 16 | `qa-83bf319b-9eed-42c3-a8f2-9239cdac2666` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-e69521d7-f932-4f86-99f4-aadccda2c4e9` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-9491a12d-04ea-46dd-a041-0e331f279f3e` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-6113ca54-6eb7-480b-b6b6-e33bc77fcb45` |
| 11 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-a7b991ce-93fa-4556-b91b-6762cdb33217` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-f68420ff-56b9-4631-a390-91d3775d7767` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-50658ae9-f484-47b3-a4a2-f43c6cfa71d2` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-ae206f8b-7a7b-45ec-bb06-b8da5d177cfc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2aca3c20-9eae-465b-8d62-8361fe0fdf64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aca3c20-9eae-465b-8d62-8361fe0fdf64
Content-Type: application/json

--- request body ---
{"handle":"qa-fb855d15b7a4","displayName":"QA fb855d15b7a4","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aca3c20-9eae-465b-8d62-8361fe0fdf64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-fb855d15b7a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_113b2aab-0517-43a2-b1d3-443e2413e75c","handle":"qa-fb855d15b7a4","displayName":"QA fb855d15b7a4","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.805874839Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a3b872d2-76e6-4770-bb42-15ac9ef766fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3b872d2-76e6-4770-bb42-15ac9ef766fa
Content-Type: application/json

--- request body ---
{"handle":"qa-486140e77bf7","displayName":"QA 486140e77bf7","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3b872d2-76e6-4770-bb42-15ac9ef766fa
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
Location: /v1/accounts/qa-486140e77bf7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_146bc68f-6a18-46ec-9788-8b3b8f11aa7a","handle":"qa-486140e77bf7","displayName":"QA 486140e77bf7","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.843608437Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5c197a05-a07e-4a78-add9-bd54b6178a04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c197a05-a07e-4a78-add9-bd54b6178a04
Content-Type: application/json

--- request body ---
{"handle":"qa-794bf995de41","displayName":"QA 794bf995de41","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c197a05-a07e-4a78-add9-bd54b6178a04
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
Location: /v1/accounts/qa-794bf995de41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68337385-c07a-414f-a6c9-e7226b9d73ec","handle":"qa-794bf995de41","displayName":"QA 794bf995de41","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.883125731Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c768c10b-304a-4fc2-a08b-b2f5a0e0d7f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c768c10b-304a-4fc2-a08b-b2f5a0e0d7f6
Content-Type: application/json

--- request body ---
{"handle":"qa-fb855d15b7a4","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c768c10b-304a-4fc2-a08b-b2f5a0e0d7f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_113b2aab-0517-43a2-b1d3-443e2413e75c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-58a1d7fe-eb09-4d7e-8005-68fc53f4187d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a1d7fe-eb09-4d7e-8005-68fc53f4187d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-486140e77bf7","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-58a1d7fe-eb09-4d7e-8005-68fc53f4187d
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
Location: /v1/conversations/cnv_5fcae660-18dc-4926-93dd-a185d5f13174
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5fcae660-18dc-4926-93dd-a185d5f13174","subject":"Error contract","status":"open","region":"eu","participants":["qa-fb855d15b7a4","qa-486140e77bf7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.964492281Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64d2d114-535c-49d2-94d8-f1dbc2d46127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64d2d114-535c-49d2-94d8-f1dbc2d46127
Content-Type: application/json

--- request body ---
{"handle":"qa-794bf995de41","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-64d2d114-535c-49d2-94d8-f1dbc2d46127
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68337385-c07a-414f-a6c9-e7226b9d73ec"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5fcae660-18dc-4926-93dd-a185d5f13174/messages
correlation: qa-83bf319b-9eed-42c3-a8f2-9239cdac2666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83bf319b-9eed-42c3-a8f2-9239cdac2666
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83bf319b-9eed-42c3-a8f2-9239cdac2666
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_5fcae660-18dc-4926-93dd-a185d5f13174/messages","correlationId":"qa-83bf319b-9eed-42c3-a8f2-9239cdac2666"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e69521d7-f932-4f86-99f4-aadccda2c4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e69521d7-f932-4f86-99f4-aadccda2c4e9
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e69521d7-f932-4f86-99f4-aadccda2c4e9
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
correlation: qa-9491a12d-04ea-46dd-a041-0e331f279f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9491a12d-04ea-46dd-a041-0e331f279f3e
Content-Type: application/json

--- request body ---
{"handle":"qa-794bf995de41","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9491a12d-04ea-46dd-a041-0e331f279f3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9491a12d-04ea-46dd-a041-0e331f279f3e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6113ca54-6eb7-480b-b6b6-e33bc77fcb45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6113ca54-6eb7-480b-b6b6-e33bc77fcb45
Content-Type: application/json

--- request body ---
{"handle":"qa-486140e77bf7","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6113ca54-6eb7-480b-b6b6-e33bc77fcb45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_146bc68f-6a18-46ec-9788-8b3b8f11aa7a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7b991ce-93fa-4556-b91b-6762cdb33217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b991ce-93fa-4556-b91b-6762cdb33217
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7b991ce-93fa-4556-b91b-6762cdb33217
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
correlation: qa-f68420ff-56b9-4631-a390-91d3775d7767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f68420ff-56b9-4631-a390-91d3775d7767
Content-Type: application/json

--- request body ---
{"handle":"qa-486140e77bf7","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f68420ff-56b9-4631-a390-91d3775d7767
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f68420ff-56b9-4631-a390-91d3775d7767"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50658ae9-f484-47b3-a4a2-f43c6cfa71d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50658ae9-f484-47b3-a4a2-f43c6cfa71d2
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50658ae9-f484-47b3-a4a2-f43c6cfa71d2
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
correlation: qa-ae206f8b-7a7b-45ec-bb06-b8da5d177cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae206f8b-7a7b-45ec-bb06-b8da5d177cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-fb855d15b7a4","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae206f8b-7a7b-45ec-bb06-b8da5d177cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae206f8b-7a7b-45ec-bb06-b8da5d177cfc"}
```
