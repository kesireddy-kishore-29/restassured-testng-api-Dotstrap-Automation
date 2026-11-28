# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 404 | `qa-6cc4dc8a-5b34-43fa-9d3a-9b4feb0179e8` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-38274bcd-1237-4abb-95e0-cdd238cf0dd9` |
| 3 | `POST /v1/accounts` | 201 | 19 | `qa-80febc69-48a2-4f72-b545-a4fdcffca80d` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-555460a7-4ffd-41da-9478-023955e3ac79` |
| 5 | `POST /v1/conversations` | 201 | 23 | `qa-16f948e2-61f2-452d-92d8-4d9607db6740` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-4a46fa23-1dbe-43ce-a518-c839de13680d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 24 | `qa-40afb736-e4a2-4407-aa65-f1c923e70330` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 27 | `qa-f318c6b0-3b63-4ed7-ad82-37a58266ea90` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 17 | `qa-85576970-e19e-4515-b59a-9e06c77f9355` |
| 10 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-e98c8ff9-f7ef-471e-a6ff-f156d7c06ae3` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-bb8a9444-3aea-4fae-8a25-f61264b151ff` |
| 12 | `POST /v1/auth/token` | 200 | 19 | `qa-a8c1f2c8-6e9a-4f48-ad1c-fd1f75efe1ed` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-539f6ae7-5104-4892-a622-91e83fb6ec81` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-915d47bf-5e85-4b66-bbd2-3b5e84f67d64` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-791cdd9e-41fd-4614-987b-c9c8e41bc603` |
| 16 | `POST /v1/auth/token` | 401 | 14 | `qa-39a783c8-6ef2-4b89-ab7f-e2c9e8c29929` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cc4dc8a-5b34-43fa-9d3a-9b4feb0179e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cc4dc8a-5b34-43fa-9d3a-9b4feb0179e8
Content-Type: application/json

--- request body ---
{"handle":"qa-656a0cffdb6f","displayName":"QA 656a0cffdb6f","password":"****","region":"eu"}

--- response: 201 in 404 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cc4dc8a-5b34-43fa-9d3a-9b4feb0179e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-656a0cffdb6f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_682aa3d9-f818-4094-acac-bfbcc01e0a46","handle":"qa-656a0cffdb6f","displayName":"QA 656a0cffdb6f","region":"eu","role":"user","createdAt":"2026-11-27T10:59:50.263634302Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-38274bcd-1237-4abb-95e0-cdd238cf0dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38274bcd-1237-4abb-95e0-cdd238cf0dd9
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8f97c42974","displayName":"QA bc8f97c42974","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-38274bcd-1237-4abb-95e0-cdd238cf0dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-bc8f97c42974
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3260f2c4-7866-4b30-af0c-ff2e67a08267","handle":"qa-bc8f97c42974","displayName":"QA bc8f97c42974","region":"eu","role":"user","createdAt":"2026-11-27T10:59:50.576566365Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-80febc69-48a2-4f72-b545-a4fdcffca80d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80febc69-48a2-4f72-b545-a4fdcffca80d
Content-Type: application/json

--- request body ---
{"handle":"qa-feaf92492a45","displayName":"QA feaf92492a45","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-80febc69-48a2-4f72-b545-a4fdcffca80d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-feaf92492a45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f137707-2466-4eb1-8d88-74ad3ee4f67a","handle":"qa-feaf92492a45","displayName":"QA feaf92492a45","region":"eu","role":"user","createdAt":"2026-11-27T10:59:50.606261267Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-555460a7-4ffd-41da-9478-023955e3ac79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555460a7-4ffd-41da-9478-023955e3ac79
Content-Type: application/json

--- request body ---
{"handle":"qa-656a0cffdb6f","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-555460a7-4ffd-41da-9478-023955e3ac79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_682aa3d9-f818-4094-acac-bfbcc01e0a46"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-16f948e2-61f2-452d-92d8-4d9607db6740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f948e2-61f2-452d-92d8-4d9607db6740
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc8f97c42974","subject":"Private","message":"Just us"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f948e2-61f2-452d-92d8-4d9607db6740
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
Location: /v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_312ac475-204c-4915-b890-cfda936faa46","subject":"Private","status":"open","region":"eu","participants":["qa-656a0cffdb6f","qa-bc8f97c42974"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:50.710499047Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4a46fa23-1dbe-43ce-a518-c839de13680d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a46fa23-1dbe-43ce-a518-c839de13680d
Content-Type: application/json

--- request body ---
{"handle":"qa-feaf92492a45","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a46fa23-1dbe-43ce-a518-c839de13680d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f137707-2466-4eb1-8d88-74ad3ee4f67a"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46
correlation: qa-40afb736-e4a2-4407-aa65-f1c923e70330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40afb736-e4a2-4407-aa65-f1c923e70330
Content-Type: application/json

--- response: 403 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40afb736-e4a2-4407-aa65-f1c923e70330
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46","correlationId":"qa-40afb736-e4a2-4407-aa65-f1c923e70330"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46/messages
correlation: qa-f318c6b0-3b63-4ed7-ad82-37a58266ea90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f318c6b0-3b63-4ed7-ad82-37a58266ea90
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f318c6b0-3b63-4ed7-ad82-37a58266ea90
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46/messages","correlationId":"qa-f318c6b0-3b63-4ed7-ad82-37a58266ea90"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46/messages
correlation: qa-85576970-e19e-4515-b59a-9e06c77f9355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85576970-e19e-4515-b59a-9e06c77f9355
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85576970-e19e-4515-b59a-9e06c77f9355
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_312ac475-204c-4915-b890-cfda936faa46/messages","correlationId":"qa-85576970-e19e-4515-b59a-9e06c77f9355"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e98c8ff9-f7ef-471e-a6ff-f156d7c06ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98c8ff9-f7ef-471e-a6ff-f156d7c06ae3
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e98c8ff9-f7ef-471e-a6ff-f156d7c06ae3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-bb8a9444-3aea-4fae-8a25-f61264b151ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8a9444-3aea-4fae-8a25-f61264b151ff
Content-Type: application/json

--- request body ---
{"handle":"qa-feaf92492a45","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb8a9444-3aea-4fae-8a25-f61264b151ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb8a9444-3aea-4fae-8a25-f61264b151ff"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a8c1f2c8-6e9a-4f48-ad1c-fd1f75efe1ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8c1f2c8-6e9a-4f48-ad1c-fd1f75efe1ed
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8f97c42974","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c1f2c8-6e9a-4f48-ad1c-fd1f75efe1ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3260f2c4-7866-4b30-af0c-ff2e67a08267"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-539f6ae7-5104-4892-a622-91e83fb6ec81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539f6ae7-5104-4892-a622-91e83fb6ec81
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-539f6ae7-5104-4892-a622-91e83fb6ec81
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-915d47bf-5e85-4b66-bbd2-3b5e84f67d64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-915d47bf-5e85-4b66-bbd2-3b5e84f67d64
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8f97c42974","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-915d47bf-5e85-4b66-bbd2-3b5e84f67d64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-915d47bf-5e85-4b66-bbd2-3b5e84f67d64"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-791cdd9e-41fd-4614-987b-c9c8e41bc603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-791cdd9e-41fd-4614-987b-c9c8e41bc603
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-791cdd9e-41fd-4614-987b-c9c8e41bc603
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-39a783c8-6ef2-4b89-ab7f-e2c9e8c29929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a783c8-6ef2-4b89-ab7f-e2c9e8c29929
Content-Type: application/json

--- request body ---
{"handle":"qa-656a0cffdb6f","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39a783c8-6ef2-4b89-ab7f-e2c9e8c29929
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39a783c8-6ef2-4b89-ab7f-e2c9e8c29929"}
```
