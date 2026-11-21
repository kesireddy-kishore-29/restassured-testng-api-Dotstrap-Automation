# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-5c62237f-2b89-497e-9352-b4c0aed4cdaf` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-c30f4b50-f524-49a3-a527-04608fbdd2a7` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 13 | `qa-8f091236-21ff-4965-83cf-a3840a841a6f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-af6f65c5-f39e-4949-87f4-d38150100e4f` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-a285fb42-1f30-49dd-9f72-95206d3975f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c62237f-2b89-497e-9352-b4c0aed4cdaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c62237f-2b89-497e-9352-b4c0aed4cdaf
Content-Type: application/json

--- request body ---
{"handle":"qa-2829de613842","displayName":"QA 2829de613842","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c62237f-2b89-497e-9352-b4c0aed4cdaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Location: /v1/accounts/qa-2829de613842
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd7af42a-cf9e-4f0a-9b41-691fed518de5","handle":"qa-2829de613842","displayName":"QA 2829de613842","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.424316674Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c30f4b50-f524-49a3-a527-04608fbdd2a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30f4b50-f524-49a3-a527-04608fbdd2a7
Content-Type: application/json

--- request body ---
{"handle":"qa-2829de613842","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c30f4b50-f524-49a3-a527-04608fbdd2a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd7af42a-cf9e-4f0a-9b41-691fed518de5"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8f091236-21ff-4965-83cf-a3840a841a6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f091236-21ff-4965-83cf-a3840a841a6f
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f091236-21ff-4965-83cf-a3840a841a6f
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8f091236-21ff-4965-83cf-a3840a841a6f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af6f65c5-f39e-4949-87f4-d38150100e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af6f65c5-f39e-4949-87f4-d38150100e4f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af6f65c5-f39e-4949-87f4-d38150100e4f
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a285fb42-1f30-49dd-9f72-95206d3975f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a285fb42-1f30-49dd-9f72-95206d3975f5
Content-Type: application/json

--- request body ---
{"handle":"qa-2829de613842","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a285fb42-1f30-49dd-9f72-95206d3975f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a285fb42-1f30-49dd-9f72-95206d3975f5"}
```
