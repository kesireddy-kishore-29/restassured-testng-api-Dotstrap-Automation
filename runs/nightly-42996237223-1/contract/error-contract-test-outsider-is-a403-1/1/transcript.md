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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-641ff855-4138-4a1e-8181-a42576a06028` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-c4a5f632-6fc2-4c3c-b686-27227d179aa1` |
| 3 | `POST /v1/accounts` | 201 | 48 | `qa-6044eb74-fd1c-4ea2-bcc3-693356da9961` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-51657d50-1356-4ec6-a3e8-b8b85b7c2722` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-aa81ad87-fd81-43f7-a230-b2fd5bd9027b` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-728109e6-41e4-412a-94f0-85020e56bfee` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 27 | `qa-eed9d30d-38e4-4667-9c7b-4cf164b5f9d0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-31dfb184-6c1f-4cb8-9ae6-14eef61a274c` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-76d90a47-30be-4152-a333-2364b4431634` |
| 10 | `POST /v1/auth/token` | 200 | 59 | `qa-0d5b90c0-55ff-4cf4-a3fb-193e214b9c54` |
| 11 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-addc9c0f-a625-41e9-bf5d-d958ff25070f` |
| 12 | `POST /v1/auth/token` | 401 | 14 | `qa-4e4882ae-d13b-4647-8ecc-9c0d289a1e3a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-76547c7a-3403-49ef-af5b-f99c377873bb` |
| 14 | `POST /v1/auth/token` | 401 | 26 | `qa-ffc1c2b6-9a0b-488d-9570-83a1531398af` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-641ff855-4138-4a1e-8181-a42576a06028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-641ff855-4138-4a1e-8181-a42576a06028
Content-Type: application/json

--- request body ---
{"handle":"qa-f67d1783910f","displayName":"QA f67d1783910f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-641ff855-4138-4a1e-8181-a42576a06028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Location: /v1/accounts/qa-f67d1783910f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5305cc8-2dd1-4c10-a663-8105f417e2cd","handle":"qa-f67d1783910f","displayName":"QA f67d1783910f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.149357677Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4a5f632-6fc2-4c3c-b686-27227d179aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a5f632-6fc2-4c3c-b686-27227d179aa1
Content-Type: application/json

--- request body ---
{"handle":"qa-6e0831e29ba5","displayName":"QA 6e0831e29ba5","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4a5f632-6fc2-4c3c-b686-27227d179aa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-6e0831e29ba5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d7d7ff87-fa06-4a8e-85e2-582f231ed32c","handle":"qa-6e0831e29ba5","displayName":"QA 6e0831e29ba5","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.217117148Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6044eb74-fd1c-4ea2-bcc3-693356da9961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6044eb74-fd1c-4ea2-bcc3-693356da9961
Content-Type: application/json

--- request body ---
{"handle":"qa-cd729dd66e7a","displayName":"QA cd729dd66e7a","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6044eb74-fd1c-4ea2-bcc3-693356da9961
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-cd729dd66e7a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85d977db-c0c2-4046-8d40-37814a920570","handle":"qa-cd729dd66e7a","displayName":"QA cd729dd66e7a","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.300835980Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-51657d50-1356-4ec6-a3e8-b8b85b7c2722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51657d50-1356-4ec6-a3e8-b8b85b7c2722
Content-Type: application/json

--- request body ---
{"handle":"qa-f67d1783910f","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-51657d50-1356-4ec6-a3e8-b8b85b7c2722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5305cc8-2dd1-4c10-a663-8105f417e2cd"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-aa81ad87-fd81-43f7-a230-b2fd5bd9027b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa81ad87-fd81-43f7-a230-b2fd5bd9027b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6e0831e29ba5","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa81ad87-fd81-43f7-a230-b2fd5bd9027b
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
Location: /v1/conversations/cnv_acfb2d55-8ff4-4f36-aad3-277ec7865c88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_acfb2d55-8ff4-4f36-aad3-277ec7865c88","subject":"Error contract","status":"open","region":"eu","participants":["qa-f67d1783910f","qa-6e0831e29ba5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.371165598Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-728109e6-41e4-412a-94f0-85020e56bfee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728109e6-41e4-412a-94f0-85020e56bfee
Content-Type: application/json

--- request body ---
{"handle":"qa-cd729dd66e7a","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-728109e6-41e4-412a-94f0-85020e56bfee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85d977db-c0c2-4046-8d40-37814a920570"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_acfb2d55-8ff4-4f36-aad3-277ec7865c88/messages
correlation: qa-eed9d30d-38e4-4667-9c7b-4cf164b5f9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed9d30d-38e4-4667-9c7b-4cf164b5f9d0
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eed9d30d-38e4-4667-9c7b-4cf164b5f9d0
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_acfb2d55-8ff4-4f36-aad3-277ec7865c88/messages","correlationId":"qa-eed9d30d-38e4-4667-9c7b-4cf164b5f9d0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31dfb184-6c1f-4cb8-9ae6-14eef61a274c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31dfb184-6c1f-4cb8-9ae6-14eef61a274c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31dfb184-6c1f-4cb8-9ae6-14eef61a274c
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
correlation: qa-76d90a47-30be-4152-a333-2364b4431634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d90a47-30be-4152-a333-2364b4431634
Content-Type: application/json

--- request body ---
{"handle":"qa-cd729dd66e7a","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76d90a47-30be-4152-a333-2364b4431634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76d90a47-30be-4152-a333-2364b4431634"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0d5b90c0-55ff-4cf4-a3fb-193e214b9c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d5b90c0-55ff-4cf4-a3fb-193e214b9c54
Content-Type: application/json

--- request body ---
{"handle":"qa-6e0831e29ba5","password":"****"}

--- response: 200 in 59 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d5b90c0-55ff-4cf4-a3fb-193e214b9c54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d7d7ff87-fa06-4a8e-85e2-582f231ed32c"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-addc9c0f-a625-41e9-bf5d-d958ff25070f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-addc9c0f-a625-41e9-bf5d-d958ff25070f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-addc9c0f-a625-41e9-bf5d-d958ff25070f
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
correlation: qa-4e4882ae-d13b-4647-8ecc-9c0d289a1e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e4882ae-d13b-4647-8ecc-9c0d289a1e3a
Content-Type: application/json

--- request body ---
{"handle":"qa-6e0831e29ba5","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e4882ae-d13b-4647-8ecc-9c0d289a1e3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e4882ae-d13b-4647-8ecc-9c0d289a1e3a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76547c7a-3403-49ef-af5b-f99c377873bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76547c7a-3403-49ef-af5b-f99c377873bb
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76547c7a-3403-49ef-af5b-f99c377873bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ffc1c2b6-9a0b-488d-9570-83a1531398af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffc1c2b6-9a0b-488d-9570-83a1531398af
Content-Type: application/json

--- request body ---
{"handle":"qa-f67d1783910f","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffc1c2b6-9a0b-488d-9570-83a1531398af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ffc1c2b6-9a0b-488d-9570-83a1531398af"}
```
