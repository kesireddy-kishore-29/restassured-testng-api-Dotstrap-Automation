# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-18aa75dc-c6b2-4a86-8250-4ab457172ca5` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-898c8763-7c1e-4ed6-827c-5c0be0a26743` |
| 3 | `POST /v1/accounts` | 201 | 10 | `qa-0b07c4d7-31cc-485c-b10c-3855b5ec442f` |
| 4 | `POST /v1/auth/token` | 200 | 11 | `qa-ad471321-d33c-4c03-96c5-06f273b6829a` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-c09ccda3-1d16-407b-9238-45d390da46d7` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-89ec6875-e23b-47c1-9035-68934c142db0` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 3 | `qa-7c445bce-e487-420e-a6af-f05a2e2ea6ca` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f2194386-9f6f-47fd-b4b8-e319361a1593` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-6bff17a4-f7e1-4cb2-bbc3-7a781b8874a6` |
| 10 | `POST /v1/auth/token` | 200 | 43 | `qa-444c07c5-f51f-4567-b917-0469b9383f51` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-0bf21f7e-d815-4a0d-956e-e13720741118` |
| 12 | `POST /v1/auth/token` | 401 | 8 | `qa-2b222fdd-b611-4bbd-90b5-a647d2578a07` |
| 13 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-d894d1e2-5d64-4385-accb-fe9d14b14fd7` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-dde21859-7133-4421-b86a-7f9376fc5503` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18aa75dc-c6b2-4a86-8250-4ab457172ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18aa75dc-c6b2-4a86-8250-4ab457172ca5
Content-Type: application/json

--- request body ---
{"handle":"qa-327033138091","displayName":"QA 327033138091","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-18aa75dc-c6b2-4a86-8250-4ab457172ca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 9
Location: /v1/accounts/qa-327033138091
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2e707807-7743-4834-9b27-b27815f160ee","handle":"qa-327033138091","displayName":"QA 327033138091","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.979553527Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-898c8763-7c1e-4ed6-827c-5c0be0a26743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-898c8763-7c1e-4ed6-827c-5c0be0a26743
Content-Type: application/json

--- request body ---
{"handle":"qa-beb66835d93a","displayName":"QA beb66835d93a","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-898c8763-7c1e-4ed6-827c-5c0be0a26743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Location: /v1/accounts/qa-beb66835d93a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0af5f83-af70-4fa5-9822-af8955bd52d3","handle":"qa-beb66835d93a","displayName":"QA beb66835d93a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.025651207Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0b07c4d7-31cc-485c-b10c-3855b5ec442f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b07c4d7-31cc-485c-b10c-3855b5ec442f
Content-Type: application/json

--- request body ---
{"handle":"qa-8477802fdcc6","displayName":"QA 8477802fdcc6","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b07c4d7-31cc-485c-b10c-3855b5ec442f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Location: /v1/accounts/qa-8477802fdcc6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08505fd6-116a-4c61-992b-8e759aab580a","handle":"qa-8477802fdcc6","displayName":"QA 8477802fdcc6","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.055508525Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ad471321-d33c-4c03-96c5-06f273b6829a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad471321-d33c-4c03-96c5-06f273b6829a
Content-Type: application/json

--- request body ---
{"handle":"qa-327033138091","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad471321-d33c-4c03-96c5-06f273b6829a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2e707807-7743-4834-9b27-b27815f160ee"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c09ccda3-1d16-407b-9238-45d390da46d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c09ccda3-1d16-407b-9238-45d390da46d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-beb66835d93a","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c09ccda3-1d16-407b-9238-45d390da46d7
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
Location: /v1/conversations/cnv_bd26cf30-5ea5-45ee-830e-a0bcf5cae6e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bd26cf30-5ea5-45ee-830e-a0bcf5cae6e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-327033138091","qa-beb66835d93a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.126738815Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-89ec6875-e23b-47c1-9035-68934c142db0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ec6875-e23b-47c1-9035-68934c142db0
Content-Type: application/json

--- request body ---
{"handle":"qa-8477802fdcc6","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-89ec6875-e23b-47c1-9035-68934c142db0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08505fd6-116a-4c61-992b-8e759aab580a"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_bd26cf30-5ea5-45ee-830e-a0bcf5cae6e0/close
correlation: qa-7c445bce-e487-420e-a6af-f05a2e2ea6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c445bce-e487-420e-a6af-f05a2e2ea6ca
Content-Type: application/json

--- response: 403 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c445bce-e487-420e-a6af-f05a2e2ea6ca
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_bd26cf30-5ea5-45ee-830e-a0bcf5cae6e0/close","correlationId":"qa-7c445bce-e487-420e-a6af-f05a2e2ea6ca"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2194386-9f6f-47fd-b4b8-e319361a1593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2194386-9f6f-47fd-b4b8-e319361a1593
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2194386-9f6f-47fd-b4b8-e319361a1593
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
correlation: qa-6bff17a4-f7e1-4cb2-bbc3-7a781b8874a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bff17a4-f7e1-4cb2-bbc3-7a781b8874a6
Content-Type: application/json

--- request body ---
{"handle":"qa-8477802fdcc6","password":"****"}

--- response: 401 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bff17a4-f7e1-4cb2-bbc3-7a781b8874a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bff17a4-f7e1-4cb2-bbc3-7a781b8874a6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-444c07c5-f51f-4567-b917-0469b9383f51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-444c07c5-f51f-4567-b917-0469b9383f51
Content-Type: application/json

--- request body ---
{"handle":"qa-beb66835d93a","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-444c07c5-f51f-4567-b917-0469b9383f51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0af5f83-af70-4fa5-9822-af8955bd52d3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0bf21f7e-d815-4a0d-956e-e13720741118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf21f7e-d815-4a0d-956e-e13720741118
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0bf21f7e-d815-4a0d-956e-e13720741118
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
correlation: qa-2b222fdd-b611-4bbd-90b5-a647d2578a07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b222fdd-b611-4bbd-90b5-a647d2578a07
Content-Type: application/json

--- request body ---
{"handle":"qa-beb66835d93a","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b222fdd-b611-4bbd-90b5-a647d2578a07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b222fdd-b611-4bbd-90b5-a647d2578a07"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d894d1e2-5d64-4385-accb-fe9d14b14fd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d894d1e2-5d64-4385-accb-fe9d14b14fd7
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d894d1e2-5d64-4385-accb-fe9d14b14fd7
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
correlation: qa-dde21859-7133-4421-b86a-7f9376fc5503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde21859-7133-4421-b86a-7f9376fc5503
Content-Type: application/json

--- request body ---
{"handle":"qa-327033138091","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dde21859-7133-4421-b86a-7f9376fc5503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dde21859-7133-4421-b86a-7f9376fc5503"}
```
