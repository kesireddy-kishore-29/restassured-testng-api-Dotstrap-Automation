# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-d4d3f073-8b46-4c00-bcdf-82eb32c63b8c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-ca32e792-13e8-4b79-8aaa-acbe92ad7f70` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-6c9380ef-8df0-4c3f-b103-e556584c08ff` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-8aedb610-ce4d-4b70-9f0b-87aa19e0f688` |
| 5 | `PATCH /v1/accounts/me` | 415 | 18 | `qa-cc538f19-ecce-4b43-9120-4084de914433` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-c2a2a159-98d6-4bba-a885-e3d244ee0c71` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-65e2e9e4-9ffb-4dd0-b5bc-48c00fe72ed2` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-cf6bcc60-9dc1-4c5e-939f-89304f8cf324` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-87c1a019-a302-4189-9dbd-ad7df6ba0692` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-7fd2f005-20c2-46f6-a38c-3a3eac52e903` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4d3f073-8b46-4c00-bcdf-82eb32c63b8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d3f073-8b46-4c00-bcdf-82eb32c63b8c
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9178e335eb","displayName":"QA 6f9178e335eb","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4d3f073-8b46-4c00-bcdf-82eb32c63b8c
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
Location: /v1/accounts/qa-6f9178e335eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b529792-36fa-4eca-a913-64eaeb138775","handle":"qa-6f9178e335eb","displayName":"QA 6f9178e335eb","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.952325671Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca32e792-13e8-4b79-8aaa-acbe92ad7f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca32e792-13e8-4b79-8aaa-acbe92ad7f70
Content-Type: application/json

--- request body ---
{"handle":"qa-72ca9f09c7f1","displayName":"QA 72ca9f09c7f1","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca32e792-13e8-4b79-8aaa-acbe92ad7f70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Location: /v1/accounts/qa-72ca9f09c7f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8072bbf-2351-4bf0-83b5-7caf1953dd60","handle":"qa-72ca9f09c7f1","displayName":"QA 72ca9f09c7f1","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.982739168Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c9380ef-8df0-4c3f-b103-e556584c08ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9380ef-8df0-4c3f-b103-e556584c08ff
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9178e335eb","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c9380ef-8df0-4c3f-b103-e556584c08ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b529792-36fa-4eca-a913-64eaeb138775"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8aedb610-ce4d-4b70-9f0b-87aa19e0f688

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aedb610-ce4d-4b70-9f0b-87aa19e0f688
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72ca9f09c7f1","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8aedb610-ce4d-4b70-9f0b-87aa19e0f688
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
Location: /v1/conversations/cnv_71621ae0-8bfa-4c2a-95b7-e75a5f71ff5e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_71621ae0-8bfa-4c2a-95b7-e75a5f71ff5e","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f9178e335eb","qa-72ca9f09c7f1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.059958716Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cc538f19-ecce-4b43-9120-4084de914433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc538f19-ecce-4b43-9120-4084de914433
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc538f19-ecce-4b43-9120-4084de914433
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-cc538f19-ecce-4b43-9120-4084de914433"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c2a2a159-98d6-4bba-a885-e3d244ee0c71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2a2a159-98d6-4bba-a885-e3d244ee0c71
Content-Type: application/json

--- request body ---
{"handle":"qa-72ca9f09c7f1","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2a2a159-98d6-4bba-a885-e3d244ee0c71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8072bbf-2351-4bf0-83b5-7caf1953dd60"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65e2e9e4-9ffb-4dd0-b5bc-48c00fe72ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e2e9e4-9ffb-4dd0-b5bc-48c00fe72ed2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65e2e9e4-9ffb-4dd0-b5bc-48c00fe72ed2
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
correlation: qa-cf6bcc60-9dc1-4c5e-939f-89304f8cf324

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6bcc60-9dc1-4c5e-939f-89304f8cf324
Content-Type: application/json

--- request body ---
{"handle":"qa-72ca9f09c7f1","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf6bcc60-9dc1-4c5e-939f-89304f8cf324
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf6bcc60-9dc1-4c5e-939f-89304f8cf324"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87c1a019-a302-4189-9dbd-ad7df6ba0692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87c1a019-a302-4189-9dbd-ad7df6ba0692
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87c1a019-a302-4189-9dbd-ad7df6ba0692
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
correlation: qa-7fd2f005-20c2-46f6-a38c-3a3eac52e903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd2f005-20c2-46f6-a38c-3a3eac52e903
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9178e335eb","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fd2f005-20c2-46f6-a38c-3a3eac52e903
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fd2f005-20c2-46f6-a38c-3a3eac52e903"}
```
