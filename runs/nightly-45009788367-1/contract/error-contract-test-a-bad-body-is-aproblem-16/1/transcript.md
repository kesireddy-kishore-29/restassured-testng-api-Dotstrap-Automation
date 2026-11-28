# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-462e91d4-10a8-48cd-9561-f81a7a2829df` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-6f96aba0-fd5b-4427-962a-d6027e3ede10` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-d7141eb8-202a-44a8-a944-843ccd114cb6` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-008acc99-2233-4b34-b1d2-ece40c937488` |
| 5 | `POST /v1/credits/purchases` | 415 | 7 | `qa-806c0997-cd1a-4c03-8ae8-ef3b4987cb30` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-883a51e1-aadc-4c82-a7be-56e0c024027d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0296134a-ca3c-4a70-b830-5e04c25466ee` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-db068099-fd59-4297-bb2b-294319bb5cf4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-5d0df8f5-246a-4628-ae2a-06d88d3606c3` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-5cee7c1c-2b6b-4e99-a809-cb7086cc0a59` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-462e91d4-10a8-48cd-9561-f81a7a2829df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462e91d4-10a8-48cd-9561-f81a7a2829df
Content-Type: application/json

--- request body ---
{"handle":"qa-32af772c947a","displayName":"QA 32af772c947a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-462e91d4-10a8-48cd-9561-f81a7a2829df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Location: /v1/accounts/qa-32af772c947a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cd4289d-a18b-45b5-a66f-1edff7387e28","handle":"qa-32af772c947a","displayName":"QA 32af772c947a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.294074173Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6f96aba0-fd5b-4427-962a-d6027e3ede10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f96aba0-fd5b-4427-962a-d6027e3ede10
Content-Type: application/json

--- request body ---
{"handle":"qa-29a9f6fca48b","displayName":"QA 29a9f6fca48b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f96aba0-fd5b-4427-962a-d6027e3ede10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Location: /v1/accounts/qa-29a9f6fca48b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27bb0b74-b056-4e6a-bb56-c38956584c8f","handle":"qa-29a9f6fca48b","displayName":"QA 29a9f6fca48b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.333626119Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7141eb8-202a-44a8-a944-843ccd114cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7141eb8-202a-44a8-a944-843ccd114cb6
Content-Type: application/json

--- request body ---
{"handle":"qa-32af772c947a","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7141eb8-202a-44a8-a944-843ccd114cb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cd4289d-a18b-45b5-a66f-1edff7387e28"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-008acc99-2233-4b34-b1d2-ece40c937488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008acc99-2233-4b34-b1d2-ece40c937488
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-29a9f6fca48b","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-008acc99-2233-4b34-b1d2-ece40c937488
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
Location: /v1/conversations/cnv_d568fba3-9ea3-405b-a153-9267dbc3bab1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d568fba3-9ea3-405b-a153-9267dbc3bab1","subject":"Error contract","status":"open","region":"eu","participants":["qa-32af772c947a","qa-29a9f6fca48b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.372193708Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-806c0997-cd1a-4c03-8ae8-ef3b4987cb30

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e9893213d9004af2bd97e9d78ebfc130
X-Correlation-Id: qa-806c0997-cd1a-4c03-8ae8-ef3b4987cb30
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-806c0997-cd1a-4c03-8ae8-ef3b4987cb30
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-806c0997-cd1a-4c03-8ae8-ef3b4987cb30"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-883a51e1-aadc-4c82-a7be-56e0c024027d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-883a51e1-aadc-4c82-a7be-56e0c024027d
Content-Type: application/json

--- request body ---
{"handle":"qa-29a9f6fca48b","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-883a51e1-aadc-4c82-a7be-56e0c024027d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27bb0b74-b056-4e6a-bb56-c38956584c8f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0296134a-ca3c-4a70-b830-5e04c25466ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0296134a-ca3c-4a70-b830-5e04c25466ee
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0296134a-ca3c-4a70-b830-5e04c25466ee
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-db068099-fd59-4297-bb2b-294319bb5cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db068099-fd59-4297-bb2b-294319bb5cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-29a9f6fca48b","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db068099-fd59-4297-bb2b-294319bb5cf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db068099-fd59-4297-bb2b-294319bb5cf4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d0df8f5-246a-4628-ae2a-06d88d3606c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d0df8f5-246a-4628-ae2a-06d88d3606c3
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d0df8f5-246a-4628-ae2a-06d88d3606c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5cee7c1c-2b6b-4e99-a809-cb7086cc0a59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cee7c1c-2b6b-4e99-a809-cb7086cc0a59
Content-Type: application/json

--- request body ---
{"handle":"qa-32af772c947a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cee7c1c-2b6b-4e99-a809-cb7086cc0a59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5cee7c1c-2b6b-4e99-a809-cb7086cc0a59"}
```
