# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-e5e97bde-22d2-41bf-bff5-081e69e3f7ce` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-13783f07-c8dd-4c5f-8798-6d26a649095a` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 12 | `qa-121e2011-4395-49ce-99f7-f4f1245ab5db` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-545ce734-30c9-40de-9812-1b9344068304` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-e508aad6-9a2d-427f-82e0-ff99bd2fd3fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5e97bde-22d2-41bf-bff5-081e69e3f7ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e97bde-22d2-41bf-bff5-081e69e3f7ce
Content-Type: application/json

--- request body ---
{"handle":"qa-cd83a2028e31","displayName":"QA cd83a2028e31","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5e97bde-22d2-41bf-bff5-081e69e3f7ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Location: /v1/accounts/qa-cd83a2028e31
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b2f0352-965b-494a-a2ef-543d3a08acd9","handle":"qa-cd83a2028e31","displayName":"QA cd83a2028e31","region":"eu","role":"user","createdAt":"2026-11-24T12:38:16.123896447Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13783f07-c8dd-4c5f-8798-6d26a649095a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13783f07-c8dd-4c5f-8798-6d26a649095a
Content-Type: application/json

--- request body ---
{"handle":"qa-cd83a2028e31","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-13783f07-c8dd-4c5f-8798-6d26a649095a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b2f0352-965b-494a-a2ef-543d3a08acd9"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-121e2011-4395-49ce-99f7-f4f1245ab5db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-121e2011-4395-49ce-99f7-f4f1245ab5db
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-121e2011-4395-49ce-99f7-f4f1245ab5db
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-121e2011-4395-49ce-99f7-f4f1245ab5db"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-545ce734-30c9-40de-9812-1b9344068304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545ce734-30c9-40de-9812-1b9344068304
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-545ce734-30c9-40de-9812-1b9344068304
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
correlation: qa-e508aad6-9a2d-427f-82e0-ff99bd2fd3fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e508aad6-9a2d-427f-82e0-ff99bd2fd3fb
Content-Type: application/json

--- request body ---
{"handle":"qa-cd83a2028e31","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e508aad6-9a2d-427f-82e0-ff99bd2fd3fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e508aad6-9a2d-427f-82e0-ff99bd2fd3fb"}
```
