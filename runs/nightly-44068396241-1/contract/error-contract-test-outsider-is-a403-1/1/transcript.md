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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-cfc60b31-97f3-4f80-8d38-ddb49d6522bc` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-0b709d40-0316-496b-bb34-77dd85cb3737` |
| 3 | `POST /v1/accounts` | 201 | 21 | `qa-4479911d-bd4b-445c-b19a-d02565b313cf` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-e6bd0b16-1d39-4a68-9b2e-f3d27afb746e` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-36519fc3-aa4a-41fd-9a9a-57de346fb745` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-167dede7-3a53-4443-b31e-fadc2f720269` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 14 | `qa-79b7fe6a-f3e2-42c0-9440-5ed424a5b3f1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-2018eeca-606f-486f-85fb-13c03ad2bede` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-4932581d-4fc7-4111-bf23-2d4f4c427cae` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-b0c16e74-572b-487c-895e-e46317eede10` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-1b0face5-3fd2-420d-8100-b7f3213c06b4` |
| 12 | `POST /v1/auth/token` | 401 | 34 | `qa-15a6b926-32a6-4c27-ab2c-2b88452761c6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-e07fb980-a4ea-4025-9968-8c01bee4136c` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-750fbe74-993b-4e3e-bc66-84accde39be9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfc60b31-97f3-4f80-8d38-ddb49d6522bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc60b31-97f3-4f80-8d38-ddb49d6522bc
Content-Type: application/json

--- request body ---
{"handle":"qa-7de69a58b28b","displayName":"QA 7de69a58b28b","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfc60b31-97f3-4f80-8d38-ddb49d6522bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-7de69a58b28b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cf1c6b7-1a11-4ea2-938e-bf9df551e855","handle":"qa-7de69a58b28b","displayName":"QA 7de69a58b28b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.723995501Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b709d40-0316-496b-bb34-77dd85cb3737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b709d40-0316-496b-bb34-77dd85cb3737
Content-Type: application/json

--- request body ---
{"handle":"qa-aad607bcdcbe","displayName":"QA aad607bcdcbe","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b709d40-0316-496b-bb34-77dd85cb3737
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-aad607bcdcbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6bd6d5a-84ea-4fba-afdd-c9791d2ba7a9","handle":"qa-aad607bcdcbe","displayName":"QA aad607bcdcbe","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.756717917Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4479911d-bd4b-445c-b19a-d02565b313cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4479911d-bd4b-445c-b19a-d02565b313cf
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e3df556cbc","displayName":"QA f3e3df556cbc","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4479911d-bd4b-445c-b19a-d02565b313cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-f3e3df556cbc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f90aa21e-eebf-4a54-93a1-cfda2e5b8433","handle":"qa-f3e3df556cbc","displayName":"QA f3e3df556cbc","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.807612408Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e6bd0b16-1d39-4a68-9b2e-f3d27afb746e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6bd0b16-1d39-4a68-9b2e-f3d27afb746e
Content-Type: application/json

--- request body ---
{"handle":"qa-7de69a58b28b","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6bd0b16-1d39-4a68-9b2e-f3d27afb746e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cf1c6b7-1a11-4ea2-938e-bf9df551e855"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-36519fc3-aa4a-41fd-9a9a-57de346fb745

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36519fc3-aa4a-41fd-9a9a-57de346fb745
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aad607bcdcbe","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-36519fc3-aa4a-41fd-9a9a-57de346fb745
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
Location: /v1/conversations/cnv_099c68d4-14ce-4271-8fd7-503cc9b6e315
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_099c68d4-14ce-4271-8fd7-503cc9b6e315","subject":"Error contract","status":"open","region":"eu","participants":["qa-7de69a58b28b","qa-aad607bcdcbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.858692565Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-167dede7-3a53-4443-b31e-fadc2f720269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167dede7-3a53-4443-b31e-fadc2f720269
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e3df556cbc","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-167dede7-3a53-4443-b31e-fadc2f720269
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f90aa21e-eebf-4a54-93a1-cfda2e5b8433"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_099c68d4-14ce-4271-8fd7-503cc9b6e315/messages
correlation: qa-79b7fe6a-f3e2-42c0-9440-5ed424a5b3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b7fe6a-f3e2-42c0-9440-5ed424a5b3f1
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79b7fe6a-f3e2-42c0-9440-5ed424a5b3f1
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_099c68d4-14ce-4271-8fd7-503cc9b6e315/messages","correlationId":"qa-79b7fe6a-f3e2-42c0-9440-5ed424a5b3f1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2018eeca-606f-486f-85fb-13c03ad2bede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2018eeca-606f-486f-85fb-13c03ad2bede
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2018eeca-606f-486f-85fb-13c03ad2bede
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
correlation: qa-4932581d-4fc7-4111-bf23-2d4f4c427cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4932581d-4fc7-4111-bf23-2d4f4c427cae
Content-Type: application/json

--- request body ---
{"handle":"qa-f3e3df556cbc","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4932581d-4fc7-4111-bf23-2d4f4c427cae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4932581d-4fc7-4111-bf23-2d4f4c427cae"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b0c16e74-572b-487c-895e-e46317eede10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c16e74-572b-487c-895e-e46317eede10
Content-Type: application/json

--- request body ---
{"handle":"qa-aad607bcdcbe","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c16e74-572b-487c-895e-e46317eede10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6bd6d5a-84ea-4fba-afdd-c9791d2ba7a9"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b0face5-3fd2-420d-8100-b7f3213c06b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b0face5-3fd2-420d-8100-b7f3213c06b4
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b0face5-3fd2-420d-8100-b7f3213c06b4
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
correlation: qa-15a6b926-32a6-4c27-ab2c-2b88452761c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a6b926-32a6-4c27-ab2c-2b88452761c6
Content-Type: application/json

--- request body ---
{"handle":"qa-aad607bcdcbe","password":"****"}

--- response: 401 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15a6b926-32a6-4c27-ab2c-2b88452761c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15a6b926-32a6-4c27-ab2c-2b88452761c6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e07fb980-a4ea-4025-9968-8c01bee4136c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e07fb980-a4ea-4025-9968-8c01bee4136c
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e07fb980-a4ea-4025-9968-8c01bee4136c
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
correlation: qa-750fbe74-993b-4e3e-bc66-84accde39be9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-750fbe74-993b-4e3e-bc66-84accde39be9
Content-Type: application/json

--- request body ---
{"handle":"qa-7de69a58b28b","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-750fbe74-993b-4e3e-bc66-84accde39be9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-750fbe74-993b-4e3e-bc66-84accde39be9"}
```
