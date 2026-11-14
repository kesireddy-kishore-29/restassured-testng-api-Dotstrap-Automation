# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-470b0444-2032-42fa-9d5a-5aafb6acb540` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-6ee46223-0e04-4b19-aea0-0b88ce9ecc9c` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-51feb86c-4576-4eb0-a37f-214c288910ac` |
| 4 | `POST /v1/auth/token` | 200 | 46 | `qa-40638d56-7389-4bfe-9209-37392e2dc327` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-417d418d-8288-4fdd-b540-486cc21ad4c4` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-d2b766fb-0acc-440f-a060-5c6fe1e21871` |
| 7 | `GET /v1/conversations/{id}` | 403 | 12 | `qa-833ef126-63a9-42ce-b37c-ad5a0dfd35ce` |
| 8 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-788b6041-82a6-4333-b297-6e70cfedd117` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-d05e3fb1-8372-4e8c-8701-4868a5c3b148` |
| 10 | `POST /v1/auth/token` | 200 | 43 | `qa-179a5514-7ba5-4a8d-98d9-97e3c98e0490` |
| 11 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-cfa03ef4-58c1-4111-b738-3d2caf956c50` |
| 12 | `POST /v1/auth/token` | 401 | 53 | `qa-a9bf22cd-f41a-4e71-8481-4c06a740e697` |
| 13 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-f5aa8b91-e210-4a50-b5e9-bd10594b941d` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-363e402f-dda7-4662-ace9-69b2049b7e53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-470b0444-2032-42fa-9d5a-5aafb6acb540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-470b0444-2032-42fa-9d5a-5aafb6acb540
Content-Type: application/json

--- request body ---
{"handle":"qa-4eefcb37cdd0","displayName":"QA 4eefcb37cdd0","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-470b0444-2032-42fa-9d5a-5aafb6acb540
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-4eefcb37cdd0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd11f062-0b92-4c57-986c-9f763a32146c","handle":"qa-4eefcb37cdd0","displayName":"QA 4eefcb37cdd0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.123919198Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ee46223-0e04-4b19-aea0-0b88ce9ecc9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee46223-0e04-4b19-aea0-0b88ce9ecc9c
Content-Type: application/json

--- request body ---
{"handle":"qa-df25d5ae1bed","displayName":"QA df25d5ae1bed","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee46223-0e04-4b19-aea0-0b88ce9ecc9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Location: /v1/accounts/qa-df25d5ae1bed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_552f0c50-9fd7-4426-8896-23d6728a4147","handle":"qa-df25d5ae1bed","displayName":"QA df25d5ae1bed","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.164742810Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-51feb86c-4576-4eb0-a37f-214c288910ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51feb86c-4576-4eb0-a37f-214c288910ac
Content-Type: application/json

--- request body ---
{"handle":"qa-33e8389820e1","displayName":"QA 33e8389820e1","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-51feb86c-4576-4eb0-a37f-214c288910ac
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
Location: /v1/accounts/qa-33e8389820e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd181226-a594-440a-8f6b-57c260a497ec","handle":"qa-33e8389820e1","displayName":"QA 33e8389820e1","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.234395695Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-40638d56-7389-4bfe-9209-37392e2dc327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40638d56-7389-4bfe-9209-37392e2dc327
Content-Type: application/json

--- request body ---
{"handle":"qa-4eefcb37cdd0","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-40638d56-7389-4bfe-9209-37392e2dc327
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd11f062-0b92-4c57-986c-9f763a32146c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-417d418d-8288-4fdd-b540-486cc21ad4c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-417d418d-8288-4fdd-b540-486cc21ad4c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-df25d5ae1bed","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-417d418d-8288-4fdd-b540-486cc21ad4c4
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
Location: /v1/conversations/cnv_3e1b3081-8dcb-4f09-964b-375a1d7448e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3e1b3081-8dcb-4f09-964b-375a1d7448e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-4eefcb37cdd0","qa-df25d5ae1bed"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.327194089Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d2b766fb-0acc-440f-a060-5c6fe1e21871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2b766fb-0acc-440f-a060-5c6fe1e21871
Content-Type: application/json

--- request body ---
{"handle":"qa-33e8389820e1","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2b766fb-0acc-440f-a060-5c6fe1e21871
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd181226-a594-440a-8f6b-57c260a497ec"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_3e1b3081-8dcb-4f09-964b-375a1d7448e5
correlation: qa-833ef126-63a9-42ce-b37c-ad5a0dfd35ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833ef126-63a9-42ce-b37c-ad5a0dfd35ce
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-833ef126-63a9-42ce-b37c-ad5a0dfd35ce
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3e1b3081-8dcb-4f09-964b-375a1d7448e5","correlationId":"qa-833ef126-63a9-42ce-b37c-ad5a0dfd35ce"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-788b6041-82a6-4333-b297-6e70cfedd117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-788b6041-82a6-4333-b297-6e70cfedd117
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-788b6041-82a6-4333-b297-6e70cfedd117
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
correlation: qa-d05e3fb1-8372-4e8c-8701-4868a5c3b148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05e3fb1-8372-4e8c-8701-4868a5c3b148
Content-Type: application/json

--- request body ---
{"handle":"qa-33e8389820e1","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d05e3fb1-8372-4e8c-8701-4868a5c3b148
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d05e3fb1-8372-4e8c-8701-4868a5c3b148"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-179a5514-7ba5-4a8d-98d9-97e3c98e0490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-179a5514-7ba5-4a8d-98d9-97e3c98e0490
Content-Type: application/json

--- request body ---
{"handle":"qa-df25d5ae1bed","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-179a5514-7ba5-4a8d-98d9-97e3c98e0490
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_552f0c50-9fd7-4426-8896-23d6728a4147"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cfa03ef4-58c1-4111-b738-3d2caf956c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa03ef4-58c1-4111-b738-3d2caf956c50
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cfa03ef4-58c1-4111-b738-3d2caf956c50
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
correlation: qa-a9bf22cd-f41a-4e71-8481-4c06a740e697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bf22cd-f41a-4e71-8481-4c06a740e697
Content-Type: application/json

--- request body ---
{"handle":"qa-df25d5ae1bed","password":"****"}

--- response: 401 in 53 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9bf22cd-f41a-4e71-8481-4c06a740e697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9bf22cd-f41a-4e71-8481-4c06a740e697"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5aa8b91-e210-4a50-b5e9-bd10594b941d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5aa8b91-e210-4a50-b5e9-bd10594b941d
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5aa8b91-e210-4a50-b5e9-bd10594b941d
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
correlation: qa-363e402f-dda7-4662-ace9-69b2049b7e53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363e402f-dda7-4662-ace9-69b2049b7e53
Content-Type: application/json

--- request body ---
{"handle":"qa-4eefcb37cdd0","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-363e402f-dda7-4662-ace9-69b2049b7e53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-363e402f-dda7-4662-ace9-69b2049b7e53"}
```
