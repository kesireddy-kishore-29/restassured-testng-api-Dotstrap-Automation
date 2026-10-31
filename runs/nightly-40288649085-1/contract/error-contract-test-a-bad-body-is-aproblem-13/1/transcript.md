# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-dfdc98a0-a531-4d2f-90c8-cd229a764922` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9d49e9b3-a839-4d00-8de5-9b0d18e34040` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-76252b1b-7ba0-4174-9bed-42c911c1f85d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-1e6437d7-9cd0-4a4d-ad1c-f60d4ed9b581` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 21 | `qa-be8922ee-e749-4fa7-95bf-fa9adb842562` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-d1d7a41f-9f17-4905-99f5-5ce11a2a0669` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-363cff4a-9384-4fb7-932f-91fedaa8ced4` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-20e4a8aa-17e2-49ba-8535-e31923c1e3e9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4ca16d4d-3e3b-406e-94e8-b3bcb2e0eadd` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-83e0ba9c-eff9-4959-bd37-279ecb44f6d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfdc98a0-a531-4d2f-90c8-cd229a764922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfdc98a0-a531-4d2f-90c8-cd229a764922
Content-Type: application/json

--- request body ---
{"handle":"qa-b40e19c329f8","displayName":"QA b40e19c329f8","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfdc98a0-a531-4d2f-90c8-cd229a764922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Location: /v1/accounts/qa-b40e19c329f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87cfe1cd-12f6-4aff-9532-681ea89726c1","handle":"qa-b40e19c329f8","displayName":"QA b40e19c329f8","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.468597844Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d49e9b3-a839-4d00-8de5-9b0d18e34040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d49e9b3-a839-4d00-8de5-9b0d18e34040
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf48acf8891","displayName":"QA 0bf48acf8891","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d49e9b3-a839-4d00-8de5-9b0d18e34040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Location: /v1/accounts/qa-0bf48acf8891
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b538c52-33df-4704-9a4f-cfb2b86636ee","handle":"qa-0bf48acf8891","displayName":"QA 0bf48acf8891","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.508675576Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-76252b1b-7ba0-4174-9bed-42c911c1f85d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76252b1b-7ba0-4174-9bed-42c911c1f85d
Content-Type: application/json

--- request body ---
{"handle":"qa-b40e19c329f8","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-76252b1b-7ba0-4174-9bed-42c911c1f85d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87cfe1cd-12f6-4aff-9532-681ea89726c1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e6437d7-9cd0-4a4d-ad1c-f60d4ed9b581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e6437d7-9cd0-4a4d-ad1c-f60d4ed9b581
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0bf48acf8891","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e6437d7-9cd0-4a4d-ad1c-f60d4ed9b581
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
Location: /v1/conversations/cnv_3abc3f70-1c63-4a09-b471-42d4a731ab1d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3abc3f70-1c63-4a09-b471-42d4a731ab1d","subject":"Error contract","status":"open","region":"eu","participants":["qa-b40e19c329f8","qa-0bf48acf8891"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.581551131Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3abc3f70-1c63-4a09-b471-42d4a731ab1d/messages
correlation: qa-be8922ee-e749-4fa7-95bf-fa9adb842562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be8922ee-e749-4fa7-95bf-fa9adb842562
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be8922ee-e749-4fa7-95bf-fa9adb842562
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_3abc3f70-1c63-4a09-b471-42d4a731ab1d/messages","correlationId":"qa-be8922ee-e749-4fa7-95bf-fa9adb842562"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d1d7a41f-9f17-4905-99f5-5ce11a2a0669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1d7a41f-9f17-4905-99f5-5ce11a2a0669
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf48acf8891","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1d7a41f-9f17-4905-99f5-5ce11a2a0669
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b538c52-33df-4704-9a4f-cfb2b86636ee"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-363cff4a-9384-4fb7-932f-91fedaa8ced4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363cff4a-9384-4fb7-932f-91fedaa8ced4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-363cff4a-9384-4fb7-932f-91fedaa8ced4
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
correlation: qa-20e4a8aa-17e2-49ba-8535-e31923c1e3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20e4a8aa-17e2-49ba-8535-e31923c1e3e9
Content-Type: application/json

--- request body ---
{"handle":"qa-0bf48acf8891","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20e4a8aa-17e2-49ba-8535-e31923c1e3e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20e4a8aa-17e2-49ba-8535-e31923c1e3e9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ca16d4d-3e3b-406e-94e8-b3bcb2e0eadd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca16d4d-3e3b-406e-94e8-b3bcb2e0eadd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ca16d4d-3e3b-406e-94e8-b3bcb2e0eadd
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
correlation: qa-83e0ba9c-eff9-4959-bd37-279ecb44f6d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e0ba9c-eff9-4959-bd37-279ecb44f6d8
Content-Type: application/json

--- request body ---
{"handle":"qa-b40e19c329f8","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83e0ba9c-eff9-4959-bd37-279ecb44f6d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83e0ba9c-eff9-4959-bd37-279ecb44f6d8"}
```
