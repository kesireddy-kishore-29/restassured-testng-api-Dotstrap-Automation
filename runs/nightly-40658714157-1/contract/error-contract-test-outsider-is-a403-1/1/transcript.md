# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-c82b6038-c8a5-437b-9d8b-02f2cbea4f11` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-86784a33-ad88-4a1c-b377-d7308a577f4a` |
| 3 | `POST /v1/accounts` | 201 | 11 | `qa-d2429398-0b4d-4608-b623-2a9201896bcf` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-cdc82aed-8e70-4f71-b5f4-43365c107e77` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-a0608d1c-84db-4193-bba7-d42229141d25` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-1df3c6c4-8243-4712-bf78-c7c48fab83e9` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 3 | `qa-549f964f-265a-4fa9-907d-bee5a4a30ad4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-66a2399e-4b6c-4fec-8bb1-98fee7462bdc` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-79d85149-91ab-418f-a0b9-119741d5d7d4` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-52ba8f2d-85f6-4fa0-9da7-ef370bb373c9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-3bc59d11-4692-4ad3-8d23-2b2aee5a7ccc` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-eb11e5d6-502a-4e57-96cc-4f3e2fff3977` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-7c71855a-2980-4d47-968a-64306ac6c49f` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-6621e227-eb7c-4426-bafa-f774bfeba14c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c82b6038-c8a5-437b-9d8b-02f2cbea4f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82b6038-c8a5-437b-9d8b-02f2cbea4f11
Content-Type: application/json

--- request body ---
{"handle":"qa-0479a1b9bcfd","displayName":"QA 0479a1b9bcfd","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c82b6038-c8a5-437b-9d8b-02f2cbea4f11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-0479a1b9bcfd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14c02623-cefb-4aa6-ad2a-9174d806a46b","handle":"qa-0479a1b9bcfd","displayName":"QA 0479a1b9bcfd","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.528274170Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-86784a33-ad88-4a1c-b377-d7308a577f4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86784a33-ad88-4a1c-b377-d7308a577f4a
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebab6248616","displayName":"QA 3ebab6248616","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-86784a33-ad88-4a1c-b377-d7308a577f4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Location: /v1/accounts/qa-3ebab6248616
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90339d26-6042-4c08-ba30-5e9ffe88eec8","handle":"qa-3ebab6248616","displayName":"QA 3ebab6248616","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.543794889Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d2429398-0b4d-4608-b623-2a9201896bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2429398-0b4d-4608-b623-2a9201896bcf
Content-Type: application/json

--- request body ---
{"handle":"qa-db35bfb642a5","displayName":"QA db35bfb642a5","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2429398-0b4d-4608-b623-2a9201896bcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 10
Location: /v1/accounts/qa-db35bfb642a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56595d42-dd5e-499c-a607-8079a3eb98b2","handle":"qa-db35bfb642a5","displayName":"QA db35bfb642a5","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.554916083Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-cdc82aed-8e70-4f71-b5f4-43365c107e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc82aed-8e70-4f71-b5f4-43365c107e77
Content-Type: application/json

--- request body ---
{"handle":"qa-0479a1b9bcfd","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc82aed-8e70-4f71-b5f4-43365c107e77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14c02623-cefb-4aa6-ad2a-9174d806a46b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a0608d1c-84db-4193-bba7-d42229141d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0608d1c-84db-4193-bba7-d42229141d25
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3ebab6248616","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0608d1c-84db-4193-bba7-d42229141d25
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
Location: /v1/conversations/cnv_936adff7-8a5f-4e0a-bc1d-d815360b6fa1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_936adff7-8a5f-4e0a-bc1d-d815360b6fa1","subject":"Error contract","status":"open","region":"eu","participants":["qa-0479a1b9bcfd","qa-3ebab6248616"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.612540444Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1df3c6c4-8243-4712-bf78-c7c48fab83e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df3c6c4-8243-4712-bf78-c7c48fab83e9
Content-Type: application/json

--- request body ---
{"handle":"qa-db35bfb642a5","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1df3c6c4-8243-4712-bf78-c7c48fab83e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56595d42-dd5e-499c-a607-8079a3eb98b2"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_936adff7-8a5f-4e0a-bc1d-d815360b6fa1/messages
correlation: qa-549f964f-265a-4fa9-907d-bee5a4a30ad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-549f964f-265a-4fa9-907d-bee5a4a30ad4
Content-Type: application/json

--- response: 403 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-549f964f-265a-4fa9-907d-bee5a4a30ad4
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_936adff7-8a5f-4e0a-bc1d-d815360b6fa1/messages","correlationId":"qa-549f964f-265a-4fa9-907d-bee5a4a30ad4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66a2399e-4b6c-4fec-8bb1-98fee7462bdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a2399e-4b6c-4fec-8bb1-98fee7462bdc
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66a2399e-4b6c-4fec-8bb1-98fee7462bdc
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
correlation: qa-79d85149-91ab-418f-a0b9-119741d5d7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d85149-91ab-418f-a0b9-119741d5d7d4
Content-Type: application/json

--- request body ---
{"handle":"qa-db35bfb642a5","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79d85149-91ab-418f-a0b9-119741d5d7d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79d85149-91ab-418f-a0b9-119741d5d7d4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-52ba8f2d-85f6-4fa0-9da7-ef370bb373c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52ba8f2d-85f6-4fa0-9da7-ef370bb373c9
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebab6248616","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-52ba8f2d-85f6-4fa0-9da7-ef370bb373c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90339d26-6042-4c08-ba30-5e9ffe88eec8"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3bc59d11-4692-4ad3-8d23-2b2aee5a7ccc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bc59d11-4692-4ad3-8d23-2b2aee5a7ccc
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3bc59d11-4692-4ad3-8d23-2b2aee5a7ccc
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
correlation: qa-eb11e5d6-502a-4e57-96cc-4f3e2fff3977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb11e5d6-502a-4e57-96cc-4f3e2fff3977
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebab6248616","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb11e5d6-502a-4e57-96cc-4f3e2fff3977
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb11e5d6-502a-4e57-96cc-4f3e2fff3977"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c71855a-2980-4d47-968a-64306ac6c49f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c71855a-2980-4d47-968a-64306ac6c49f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c71855a-2980-4d47-968a-64306ac6c49f
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
correlation: qa-6621e227-eb7c-4426-bafa-f774bfeba14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6621e227-eb7c-4426-bafa-f774bfeba14c
Content-Type: application/json

--- request body ---
{"handle":"qa-0479a1b9bcfd","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6621e227-eb7c-4426-bafa-f774bfeba14c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6621e227-eb7c-4426-bafa-f774bfeba14c"}
```
