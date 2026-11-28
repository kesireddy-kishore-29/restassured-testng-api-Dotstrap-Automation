# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-7e10d4a4-a539-4af4-a276-fff0dd0319ba` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-8259d913-5eb4-4ce0-aee7-0238ff741c53` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-df3b8edb-8946-41d3-856b-ef0a808fcb24` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-8d184c42-0872-4a67-a901-c6ed73253b96` |
| 5 | `PATCH /v1/accounts/me` | 400 | 9 | `qa-6103bf76-78ca-4b0a-b542-a841fe7a8dd4` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-2441c7e7-b503-4409-a82e-cd4955f5d7ec` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-62a1b16c-e031-42fc-83e8-837e0adfd59f` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-faf60f3c-924f-408b-a3d2-f22ddf745218` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-be69269a-4393-47cb-b8fe-fcba6159c7fd` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-5b597794-de6e-49de-a7a7-4fd5c8844950` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7e10d4a4-a539-4af4-a276-fff0dd0319ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e10d4a4-a539-4af4-a276-fff0dd0319ba
Content-Type: application/json

--- request body ---
{"handle":"qa-608cc05d085a","displayName":"QA 608cc05d085a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e10d4a4-a539-4af4-a276-fff0dd0319ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 9
Location: /v1/accounts/qa-608cc05d085a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c12432ca-e073-41ab-b73d-b113a37561ac","handle":"qa-608cc05d085a","displayName":"QA 608cc05d085a","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.382597271Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8259d913-5eb4-4ce0-aee7-0238ff741c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8259d913-5eb4-4ce0-aee7-0238ff741c53
Content-Type: application/json

--- request body ---
{"handle":"qa-7b47a45a2b32","displayName":"QA 7b47a45a2b32","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8259d913-5eb4-4ce0-aee7-0238ff741c53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Location: /v1/accounts/qa-7b47a45a2b32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4672ca98-a429-470c-a120-abaa3a5f523e","handle":"qa-7b47a45a2b32","displayName":"QA 7b47a45a2b32","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.412596747Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df3b8edb-8946-41d3-856b-ef0a808fcb24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3b8edb-8946-41d3-856b-ef0a808fcb24
Content-Type: application/json

--- request body ---
{"handle":"qa-608cc05d085a","password":"****"}

--- response: 200 in 50 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-df3b8edb-8946-41d3-856b-ef0a808fcb24
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c12432ca-e073-41ab-b73d-b113a37561ac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8d184c42-0872-4a67-a901-c6ed73253b96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d184c42-0872-4a67-a901-c6ed73253b96
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7b47a45a2b32","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d184c42-0872-4a67-a901-c6ed73253b96
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
Location: /v1/conversations/cnv_43da4a46-49d4-4559-ad8d-c7aad386ded0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_43da4a46-49d4-4559-ad8d-c7aad386ded0","subject":"Error contract","status":"open","region":"eu","participants":["qa-608cc05d085a","qa-7b47a45a2b32"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.494323541Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6103bf76-78ca-4b0a-b542-a841fe7a8dd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6103bf76-78ca-4b0a-b542-a841fe7a8dd4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6103bf76-78ca-4b0a-b542-a841fe7a8dd4
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-6103bf76-78ca-4b0a-b542-a841fe7a8dd4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2441c7e7-b503-4409-a82e-cd4955f5d7ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2441c7e7-b503-4409-a82e-cd4955f5d7ec
Content-Type: application/json

--- request body ---
{"handle":"qa-7b47a45a2b32","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-2441c7e7-b503-4409-a82e-cd4955f5d7ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4672ca98-a429-470c-a120-abaa3a5f523e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62a1b16c-e031-42fc-83e8-837e0adfd59f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a1b16c-e031-42fc-83e8-837e0adfd59f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62a1b16c-e031-42fc-83e8-837e0adfd59f
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
correlation: qa-faf60f3c-924f-408b-a3d2-f22ddf745218

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faf60f3c-924f-408b-a3d2-f22ddf745218
Content-Type: application/json

--- request body ---
{"handle":"qa-7b47a45a2b32","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faf60f3c-924f-408b-a3d2-f22ddf745218
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faf60f3c-924f-408b-a3d2-f22ddf745218"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be69269a-4393-47cb-b8fe-fcba6159c7fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be69269a-4393-47cb-b8fe-fcba6159c7fd
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be69269a-4393-47cb-b8fe-fcba6159c7fd
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
correlation: qa-5b597794-de6e-49de-a7a7-4fd5c8844950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b597794-de6e-49de-a7a7-4fd5c8844950
Content-Type: application/json

--- request body ---
{"handle":"qa-608cc05d085a","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b597794-de6e-49de-a7a7-4fd5c8844950
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b597794-de6e-49de-a7a7-4fd5c8844950"}
```
