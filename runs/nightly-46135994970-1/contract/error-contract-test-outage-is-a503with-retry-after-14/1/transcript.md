# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-3ae8ac41-2e14-46eb-a44c-af43a53d85d7` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ebf76dba-0d14-47cc-89e3-4b4eed0f981a` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d9c57ef3-48aa-4e57-8d83-51404b4b07e4` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-cb950928-137a-4fb8-bbe8-2f46becbb000` |
| 5 | `GET /v1/credits/ledger` | 503 | 17 | `qa-23ea38ab-e69a-40d1-bcb1-444dbe1039d1` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-64e0217f-7c16-4957-b478-13efa6d200cf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d99477d8-25d8-4aad-b1f9-abb9bfb2e6ac` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-95b82e28-8332-46f1-a881-adde3589c3df` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-09c9030f-77c1-47a9-a7de-1af7c4f91fda` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-d7e5ba00-8b6b-4587-9895-53c3017ae2a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ae8ac41-2e14-46eb-a44c-af43a53d85d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ae8ac41-2e14-46eb-a44c-af43a53d85d7
Content-Type: application/json

--- request body ---
{"handle":"qa-1ae47aaf413e","displayName":"QA 1ae47aaf413e","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ae8ac41-2e14-46eb-a44c-af43a53d85d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-1ae47aaf413e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c40ac8c-493d-444a-bd38-fecd269e8f1a","handle":"qa-1ae47aaf413e","displayName":"QA 1ae47aaf413e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.330520637Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebf76dba-0d14-47cc-89e3-4b4eed0f981a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebf76dba-0d14-47cc-89e3-4b4eed0f981a
Content-Type: application/json

--- request body ---
{"handle":"qa-00c3d9aa5d12","displayName":"QA 00c3d9aa5d12","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebf76dba-0d14-47cc-89e3-4b4eed0f981a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-00c3d9aa5d12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_229352c6-4e3a-4ce7-93d7-1db3dadb9bbb","handle":"qa-00c3d9aa5d12","displayName":"QA 00c3d9aa5d12","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.366287476Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d9c57ef3-48aa-4e57-8d83-51404b4b07e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9c57ef3-48aa-4e57-8d83-51404b4b07e4
Content-Type: application/json

--- request body ---
{"handle":"qa-1ae47aaf413e","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9c57ef3-48aa-4e57-8d83-51404b4b07e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c40ac8c-493d-444a-bd38-fecd269e8f1a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cb950928-137a-4fb8-bbe8-2f46becbb000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb950928-137a-4fb8-bbe8-2f46becbb000
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00c3d9aa5d12","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb950928-137a-4fb8-bbe8-2f46becbb000
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
Location: /v1/conversations/cnv_022373fb-05a2-42a3-9de9-7259ec0cd435
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_022373fb-05a2-42a3-9de9-7259ec0cd435","subject":"Error contract","status":"open","region":"eu","participants":["qa-1ae47aaf413e","qa-00c3d9aa5d12"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.432925857Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-23ea38ab-e69a-40d1-bcb1-444dbe1039d1

--- request headers ---
Accept: application/json
X-Fault-Key: dbea53af-f9d1-4c14-9c53-9c79dff51f6a
X-Fault: unavailable-once
X-Correlation-Id: qa-23ea38ab-e69a-40d1-bcb1-444dbe1039d1
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23ea38ab-e69a-40d1-bcb1-444dbe1039d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-23ea38ab-e69a-40d1-bcb1-444dbe1039d1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64e0217f-7c16-4957-b478-13efa6d200cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64e0217f-7c16-4957-b478-13efa6d200cf
Content-Type: application/json

--- request body ---
{"handle":"qa-00c3d9aa5d12","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-64e0217f-7c16-4957-b478-13efa6d200cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_229352c6-4e3a-4ce7-93d7-1db3dadb9bbb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d99477d8-25d8-4aad-b1f9-abb9bfb2e6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99477d8-25d8-4aad-b1f9-abb9bfb2e6ac
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d99477d8-25d8-4aad-b1f9-abb9bfb2e6ac
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
correlation: qa-95b82e28-8332-46f1-a881-adde3589c3df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95b82e28-8332-46f1-a881-adde3589c3df
Content-Type: application/json

--- request body ---
{"handle":"qa-00c3d9aa5d12","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95b82e28-8332-46f1-a881-adde3589c3df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95b82e28-8332-46f1-a881-adde3589c3df"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09c9030f-77c1-47a9-a7de-1af7c4f91fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c9030f-77c1-47a9-a7de-1af7c4f91fda
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09c9030f-77c1-47a9-a7de-1af7c4f91fda
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d7e5ba00-8b6b-4587-9895-53c3017ae2a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7e5ba00-8b6b-4587-9895-53c3017ae2a3
Content-Type: application/json

--- request body ---
{"handle":"qa-1ae47aaf413e","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7e5ba00-8b6b-4587-9895-53c3017ae2a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7e5ba00-8b6b-4587-9895-53c3017ae2a3"}
```
