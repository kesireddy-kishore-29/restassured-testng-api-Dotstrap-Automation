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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-54b335ba-4293-4f1a-b80f-86332bc5cb98` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-80f38750-f92d-49ac-8b8e-f1c3c543f99d` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-387bde25-6024-4743-b6ea-eec9e09b08a0` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-05f1f3ae-c687-44d1-a730-27f46428095d` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-f4b09599-5027-45db-a430-2e8567c33625` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-56a8d083-dfa7-4be5-a98c-ce5d3127baa5` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 14 | `qa-7ac0a736-e49a-431f-8ffd-f333bc57ea6d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-6b996ec1-6e61-4675-ae13-b8a151edc252` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-c5856f7d-052f-4e70-9f3e-99a458c9e8c5` |
| 10 | `POST /v1/auth/token` | 200 | 25 | `qa-5d785062-4dd6-4a62-8360-91dca26ca560` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-686d1997-786f-41f2-b066-dfeac92a4843` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-f2518ff0-2a55-4cf1-847e-a6b51b0060df` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0a4fa2ad-07ad-47d3-84ff-c87f1047c8ec` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-66c04b57-eeb8-47d8-a825-fc34e3f30762` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54b335ba-4293-4f1a-b80f-86332bc5cb98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b335ba-4293-4f1a-b80f-86332bc5cb98
Content-Type: application/json

--- request body ---
{"handle":"qa-1a63322dde2a","displayName":"QA 1a63322dde2a","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-54b335ba-4293-4f1a-b80f-86332bc5cb98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-1a63322dde2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4949f5e0-47f6-4766-b2f3-5945ad3efa93","handle":"qa-1a63322dde2a","displayName":"QA 1a63322dde2a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.213767229Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-80f38750-f92d-49ac-8b8e-f1c3c543f99d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f38750-f92d-49ac-8b8e-f1c3c543f99d
Content-Type: application/json

--- request body ---
{"handle":"qa-315ddc0cb339","displayName":"QA 315ddc0cb339","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-80f38750-f92d-49ac-8b8e-f1c3c543f99d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-315ddc0cb339
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afdf3128-879e-462a-bb61-a648018a3517","handle":"qa-315ddc0cb339","displayName":"QA 315ddc0cb339","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.253467363Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-387bde25-6024-4743-b6ea-eec9e09b08a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387bde25-6024-4743-b6ea-eec9e09b08a0
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d22943cd2b","displayName":"QA f5d22943cd2b","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-387bde25-6024-4743-b6ea-eec9e09b08a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Location: /v1/accounts/qa-f5d22943cd2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3f93fa5-16d9-4aa5-9c90-831b93ee048a","handle":"qa-f5d22943cd2b","displayName":"QA f5d22943cd2b","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.295179870Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-05f1f3ae-c687-44d1-a730-27f46428095d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05f1f3ae-c687-44d1-a730-27f46428095d
Content-Type: application/json

--- request body ---
{"handle":"qa-1a63322dde2a","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-05f1f3ae-c687-44d1-a730-27f46428095d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4949f5e0-47f6-4766-b2f3-5945ad3efa93"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f4b09599-5027-45db-a430-2e8567c33625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b09599-5027-45db-a430-2e8567c33625
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-315ddc0cb339","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b09599-5027-45db-a430-2e8567c33625
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
Location: /v1/conversations/cnv_91e11098-9203-4101-bb98-b76c4db6301d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_91e11098-9203-4101-bb98-b76c4db6301d","subject":"Error contract","status":"open","region":"eu","participants":["qa-1a63322dde2a","qa-315ddc0cb339"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.374787158Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-56a8d083-dfa7-4be5-a98c-ce5d3127baa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a8d083-dfa7-4be5-a98c-ce5d3127baa5
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d22943cd2b","password":"****"}

--- response: 200 in 55 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-56a8d083-dfa7-4be5-a98c-ce5d3127baa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f93fa5-16d9-4aa5-9c90-831b93ee048a"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_91e11098-9203-4101-bb98-b76c4db6301d/close
correlation: qa-7ac0a736-e49a-431f-8ffd-f333bc57ea6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac0a736-e49a-431f-8ffd-f333bc57ea6d
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ac0a736-e49a-431f-8ffd-f333bc57ea6d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_91e11098-9203-4101-bb98-b76c4db6301d/close","correlationId":"qa-7ac0a736-e49a-431f-8ffd-f333bc57ea6d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b996ec1-6e61-4675-ae13-b8a151edc252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b996ec1-6e61-4675-ae13-b8a151edc252
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b996ec1-6e61-4675-ae13-b8a151edc252
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
correlation: qa-c5856f7d-052f-4e70-9f3e-99a458c9e8c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5856f7d-052f-4e70-9f3e-99a458c9e8c5
Content-Type: application/json

--- request body ---
{"handle":"qa-f5d22943cd2b","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5856f7d-052f-4e70-9f3e-99a458c9e8c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5856f7d-052f-4e70-9f3e-99a458c9e8c5"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5d785062-4dd6-4a62-8360-91dca26ca560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d785062-4dd6-4a62-8360-91dca26ca560
Content-Type: application/json

--- request body ---
{"handle":"qa-315ddc0cb339","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d785062-4dd6-4a62-8360-91dca26ca560
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afdf3128-879e-462a-bb61-a648018a3517"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-686d1997-786f-41f2-b066-dfeac92a4843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686d1997-786f-41f2-b066-dfeac92a4843
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-686d1997-786f-41f2-b066-dfeac92a4843
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
correlation: qa-f2518ff0-2a55-4cf1-847e-a6b51b0060df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2518ff0-2a55-4cf1-847e-a6b51b0060df
Content-Type: application/json

--- request body ---
{"handle":"qa-315ddc0cb339","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2518ff0-2a55-4cf1-847e-a6b51b0060df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2518ff0-2a55-4cf1-847e-a6b51b0060df"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a4fa2ad-07ad-47d3-84ff-c87f1047c8ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a4fa2ad-07ad-47d3-84ff-c87f1047c8ec
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a4fa2ad-07ad-47d3-84ff-c87f1047c8ec
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
correlation: qa-66c04b57-eeb8-47d8-a825-fc34e3f30762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66c04b57-eeb8-47d8-a825-fc34e3f30762
Content-Type: application/json

--- request body ---
{"handle":"qa-1a63322dde2a","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66c04b57-eeb8-47d8-a825-fc34e3f30762
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66c04b57-eeb8-47d8-a825-fc34e3f30762"}
```
