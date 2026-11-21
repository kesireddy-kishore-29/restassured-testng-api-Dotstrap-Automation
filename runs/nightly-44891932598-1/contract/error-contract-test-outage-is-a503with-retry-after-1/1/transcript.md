# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-3dcfd497-011c-4bb4-9731-a7a845db1032` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-39bb8bc7-7890-481a-bcca-e6a8ae339c75` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-dacf1e93-8a00-4939-8524-dd148f15850a` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-f291f352-7179-4aa1-8795-364888ba0abd` |
| 5 | `POST /v1/accounts` | 503 | 11 | `qa-b89ec178-a087-4fae-a73c-2925e8a5e885` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-70f11167-79a8-4105-bbfc-590658b165f8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-b78d7b14-4e78-4cd4-ab2e-d5b0691e31c2` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-43369802-0302-4096-9a61-51bc73dd99aa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ff1f42cc-49fb-45f4-b277-dcf2edcb5e10` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-9f45eca7-1d82-47ad-88f1-3a9e52c079c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3dcfd497-011c-4bb4-9731-a7a845db1032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dcfd497-011c-4bb4-9731-a7a845db1032
Content-Type: application/json

--- request body ---
{"handle":"qa-ba62f5afac30","displayName":"QA ba62f5afac30","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dcfd497-011c-4bb4-9731-a7a845db1032
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-ba62f5afac30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb0efd57-4c9a-443c-a813-84accb662370","handle":"qa-ba62f5afac30","displayName":"QA ba62f5afac30","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.135595977Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39bb8bc7-7890-481a-bcca-e6a8ae339c75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39bb8bc7-7890-481a-bcca-e6a8ae339c75
Content-Type: application/json

--- request body ---
{"handle":"qa-39e6c1be1dfe","displayName":"QA 39e6c1be1dfe","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-39bb8bc7-7890-481a-bcca-e6a8ae339c75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-39e6c1be1dfe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edbd1336-5dad-4588-888f-c1847103a120","handle":"qa-39e6c1be1dfe","displayName":"QA 39e6c1be1dfe","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.201723065Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dacf1e93-8a00-4939-8524-dd148f15850a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dacf1e93-8a00-4939-8524-dd148f15850a
Content-Type: application/json

--- request body ---
{"handle":"qa-ba62f5afac30","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-dacf1e93-8a00-4939-8524-dd148f15850a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb0efd57-4c9a-443c-a813-84accb662370"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f291f352-7179-4aa1-8795-364888ba0abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f291f352-7179-4aa1-8795-364888ba0abd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-39e6c1be1dfe","subject":"Error contract","message":"Hi"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f291f352-7179-4aa1-8795-364888ba0abd
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
Location: /v1/conversations/cnv_5a0e25aa-31b0-406c-8328-3695a5f202de
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a0e25aa-31b0-406c-8328-3695a5f202de","subject":"Error contract","status":"open","region":"eu","participants":["qa-ba62f5afac30","qa-39e6c1be1dfe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.324180896Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-b89ec178-a087-4fae-a73c-2925e8a5e885

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 41b98dae-4b9a-46ee-a10d-0d25955958b3
X-Correlation-Id: qa-b89ec178-a087-4fae-a73c-2925e8a5e885
Content-Type: application/json

--- request body ---
{"handle":"qa-3fa010337df5","displayName":"QA 3fa010337df5","password":"****","region":"eu"}

--- response: 503 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b89ec178-a087-4fae-a73c-2925e8a5e885
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-b89ec178-a087-4fae-a73c-2925e8a5e885"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70f11167-79a8-4105-bbfc-590658b165f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f11167-79a8-4105-bbfc-590658b165f8
Content-Type: application/json

--- request body ---
{"handle":"qa-39e6c1be1dfe","password":"****"}

--- response: 200 in 60 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f11167-79a8-4105-bbfc-590658b165f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edbd1336-5dad-4588-888f-c1847103a120"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b78d7b14-4e78-4cd4-ab2e-d5b0691e31c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b78d7b14-4e78-4cd4-ab2e-d5b0691e31c2
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b78d7b14-4e78-4cd4-ab2e-d5b0691e31c2
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
correlation: qa-43369802-0302-4096-9a61-51bc73dd99aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43369802-0302-4096-9a61-51bc73dd99aa
Content-Type: application/json

--- request body ---
{"handle":"qa-39e6c1be1dfe","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43369802-0302-4096-9a61-51bc73dd99aa
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43369802-0302-4096-9a61-51bc73dd99aa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff1f42cc-49fb-45f4-b277-dcf2edcb5e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1f42cc-49fb-45f4-b277-dcf2edcb5e10
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff1f42cc-49fb-45f4-b277-dcf2edcb5e10
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9f45eca7-1d82-47ad-88f1-3a9e52c079c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f45eca7-1d82-47ad-88f1-3a9e52c079c9
Content-Type: application/json

--- request body ---
{"handle":"qa-ba62f5afac30","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f45eca7-1d82-47ad-88f1-3a9e52c079c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f45eca7-1d82-47ad-88f1-3a9e52c079c9"}
```
