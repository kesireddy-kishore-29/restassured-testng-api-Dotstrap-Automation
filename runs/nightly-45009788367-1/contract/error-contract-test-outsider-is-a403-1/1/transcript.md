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
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-40bcdd72-6c98-4c5c-806d-6ba78557e48a` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-d0cc46cd-351f-4a15-a945-852ff4fb1e66` |
| 3 | `POST /v1/accounts` | 201 | 14 | `qa-54eb9879-d250-40c7-b44d-8a10167dc41a` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-519801c8-cc84-43c1-a4d3-67e3c61fe98c` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-ef0ee488-bfeb-433f-b8e4-441b26e587ad` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-4beb8dfa-9cd7-40bd-8bd3-f225995cac2a` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 19 | `qa-604eb071-5ae5-4eba-b972-eee1e588a2cf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-f2bf24ec-167b-408e-82b1-4d327f0c54d6` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-f1e40938-7cc2-49db-ad1f-1745f83c3371` |
| 10 | `POST /v1/auth/token` | 200 | 14 | `qa-1f682c26-667d-49ea-bb70-7f76684acb7c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3f8970f2-fb94-4a09-a19a-0bfff2dd3ef1` |
| 12 | `POST /v1/auth/token` | 401 | 22 | `qa-5ac952c8-9ded-4da5-8780-fe909ca6a2ab` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-afa8b763-fb14-4cf3-9792-1431c75bed99` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-e05d2918-180f-4b61-8b6e-3cfc3edc8d89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-40bcdd72-6c98-4c5c-806d-6ba78557e48a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40bcdd72-6c98-4c5c-806d-6ba78557e48a
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc230681811","displayName":"QA 0bc230681811","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-40bcdd72-6c98-4c5c-806d-6ba78557e48a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Location: /v1/accounts/qa-0bc230681811
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8dbf0dc6-7436-4d16-9d0f-9fd1cf277d1f","handle":"qa-0bc230681811","displayName":"QA 0bc230681811","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.544258358Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0cc46cd-351f-4a15-a945-852ff4fb1e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0cc46cd-351f-4a15-a945-852ff4fb1e66
Content-Type: application/json

--- request body ---
{"handle":"qa-0391ac3d0ac4","displayName":"QA 0391ac3d0ac4","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0cc46cd-351f-4a15-a945-852ff4fb1e66
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
Location: /v1/accounts/qa-0391ac3d0ac4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34b4d0bd-4bc4-467e-b632-288d19d4a75b","handle":"qa-0391ac3d0ac4","displayName":"QA 0391ac3d0ac4","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.585243719Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-54eb9879-d250-40c7-b44d-8a10167dc41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54eb9879-d250-40c7-b44d-8a10167dc41a
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b8e9c6f8b0","displayName":"QA b2b8e9c6f8b0","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-54eb9879-d250-40c7-b44d-8a10167dc41a
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
Location: /v1/accounts/qa-b2b8e9c6f8b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a29c5cd-d5a4-441d-9058-a1d0f563cdca","handle":"qa-b2b8e9c6f8b0","displayName":"QA b2b8e9c6f8b0","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.605195958Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-519801c8-cc84-43c1-a4d3-67e3c61fe98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519801c8-cc84-43c1-a4d3-67e3c61fe98c
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc230681811","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-519801c8-cc84-43c1-a4d3-67e3c61fe98c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dbf0dc6-7436-4d16-9d0f-9fd1cf277d1f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ef0ee488-bfeb-433f-b8e4-441b26e587ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef0ee488-bfeb-433f-b8e4-441b26e587ad
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0391ac3d0ac4","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef0ee488-bfeb-433f-b8e4-441b26e587ad
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
Location: /v1/conversations/cnv_29dceedd-25de-448f-883a-3b171e84bc01
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_29dceedd-25de-448f-883a-3b171e84bc01","subject":"Error contract","status":"open","region":"eu","participants":["qa-0bc230681811","qa-0391ac3d0ac4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.639148646Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4beb8dfa-9cd7-40bd-8bd3-f225995cac2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4beb8dfa-9cd7-40bd-8bd3-f225995cac2a
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b8e9c6f8b0","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4beb8dfa-9cd7-40bd-8bd3-f225995cac2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a29c5cd-d5a4-441d-9058-a1d0f563cdca"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_29dceedd-25de-448f-883a-3b171e84bc01/messages
correlation: qa-604eb071-5ae5-4eba-b972-eee1e588a2cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-604eb071-5ae5-4eba-b972-eee1e588a2cf
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-604eb071-5ae5-4eba-b972-eee1e588a2cf
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_29dceedd-25de-448f-883a-3b171e84bc01/messages","correlationId":"qa-604eb071-5ae5-4eba-b972-eee1e588a2cf"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2bf24ec-167b-408e-82b1-4d327f0c54d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2bf24ec-167b-408e-82b1-4d327f0c54d6
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2bf24ec-167b-408e-82b1-4d327f0c54d6
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
correlation: qa-f1e40938-7cc2-49db-ad1f-1745f83c3371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1e40938-7cc2-49db-ad1f-1745f83c3371
Content-Type: application/json

--- request body ---
{"handle":"qa-b2b8e9c6f8b0","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1e40938-7cc2-49db-ad1f-1745f83c3371
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1e40938-7cc2-49db-ad1f-1745f83c3371"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1f682c26-667d-49ea-bb70-7f76684acb7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f682c26-667d-49ea-bb70-7f76684acb7c
Content-Type: application/json

--- request body ---
{"handle":"qa-0391ac3d0ac4","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f682c26-667d-49ea-bb70-7f76684acb7c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34b4d0bd-4bc4-467e-b632-288d19d4a75b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f8970f2-fb94-4a09-a19a-0bfff2dd3ef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f8970f2-fb94-4a09-a19a-0bfff2dd3ef1
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f8970f2-fb94-4a09-a19a-0bfff2dd3ef1
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
correlation: qa-5ac952c8-9ded-4da5-8780-fe909ca6a2ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac952c8-9ded-4da5-8780-fe909ca6a2ab
Content-Type: application/json

--- request body ---
{"handle":"qa-0391ac3d0ac4","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ac952c8-9ded-4da5-8780-fe909ca6a2ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ac952c8-9ded-4da5-8780-fe909ca6a2ab"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afa8b763-fb14-4cf3-9792-1431c75bed99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afa8b763-fb14-4cf3-9792-1431c75bed99
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afa8b763-fb14-4cf3-9792-1431c75bed99
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
correlation: qa-e05d2918-180f-4b61-8b6e-3cfc3edc8d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e05d2918-180f-4b61-8b6e-3cfc3edc8d89
Content-Type: application/json

--- request body ---
{"handle":"qa-0bc230681811","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e05d2918-180f-4b61-8b6e-3cfc3edc8d89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e05d2918-180f-4b61-8b6e-3cfc3edc8d89"}
```
