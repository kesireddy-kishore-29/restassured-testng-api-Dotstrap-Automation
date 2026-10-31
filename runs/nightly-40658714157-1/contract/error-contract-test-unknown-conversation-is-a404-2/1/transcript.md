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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-3ae7b531-169d-4a67-901f-a40e07a9237c` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-4c10f028-9d61-4848-bfbf-432ba9bbce54` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 5 | `qa-a0a6fb55-5b77-401e-9d4e-9f097fb419bd` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1450d372-43cf-4d97-867a-64a8b758698d` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-5f4be36b-1a1e-42af-850e-b7ea62c2ac1d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ae7b531-169d-4a67-901f-a40e07a9237c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ae7b531-169d-4a67-901f-a40e07a9237c
Content-Type: application/json

--- request body ---
{"handle":"qa-938860dd586d","displayName":"QA 938860dd586d","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ae7b531-169d-4a67-901f-a40e07a9237c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-938860dd586d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c13ce972-423c-41dc-9fd9-a47216e8d051","handle":"qa-938860dd586d","displayName":"QA 938860dd586d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.616178797Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4c10f028-9d61-4848-bfbf-432ba9bbce54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c10f028-9d61-4848-bfbf-432ba9bbce54
Content-Type: application/json

--- request body ---
{"handle":"qa-938860dd586d","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c10f028-9d61-4848-bfbf-432ba9bbce54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c13ce972-423c-41dc-9fd9-a47216e8d051"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-a0a6fb55-5b77-401e-9d4e-9f097fb419bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0a6fb55-5b77-401e-9d4e-9f097fb419bd
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0a6fb55-5b77-401e-9d4e-9f097fb419bd
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-a0a6fb55-5b77-401e-9d4e-9f097fb419bd"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1450d372-43cf-4d97-867a-64a8b758698d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1450d372-43cf-4d97-867a-64a8b758698d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1450d372-43cf-4d97-867a-64a8b758698d
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
correlation: qa-5f4be36b-1a1e-42af-850e-b7ea62c2ac1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f4be36b-1a1e-42af-850e-b7ea62c2ac1d
Content-Type: application/json

--- request body ---
{"handle":"qa-938860dd586d","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f4be36b-1a1e-42af-850e-b7ea62c2ac1d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f4be36b-1a1e-42af-850e-b7ea62c2ac1d"}
```
