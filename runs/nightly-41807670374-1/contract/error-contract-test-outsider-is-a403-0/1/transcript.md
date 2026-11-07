# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-63d72cca-e725-4b9c-bb40-41d7ffbe3e18` |
| 2 | `POST /v1/accounts` | 201 | 69 | `qa-c1252360-75dc-4cd5-94fe-c6f8b465d9ac` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-70962310-d55f-4fb2-9eff-f0b5c047bbd5` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-b749fc43-18ad-4b89-8ea2-c671c4321186` |
| 5 | `POST /v1/conversations` | 201 | 30 | `qa-22b9edf0-12bc-4eff-9fc4-1dbb4498d4bc` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-84b3a7a1-9cc4-478a-b338-d2d27787b12d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-b32ace23-efcd-43b0-8ca7-2110e4494c76` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-de8eb48e-c56d-4693-a5ce-e2bf5f561896` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-138c2c46-8732-4df0-ac35-ac23834b5327` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-179b5cac-df59-466a-9a37-043606ab6a51` |
| 11 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-e1004353-6894-4f2b-bab3-0d03863b0edc` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-42df4410-38f5-4626-b839-82464b19896b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-3f43365d-9a82-45b1-bf24-7387c0260ca9` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-b82a8e2a-7a75-46f3-96af-99f953a6dce4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63d72cca-e725-4b9c-bb40-41d7ffbe3e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63d72cca-e725-4b9c-bb40-41d7ffbe3e18
Content-Type: application/json

--- request body ---
{"handle":"qa-5508c2c6611e","displayName":"QA 5508c2c6611e","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-63d72cca-e725-4b9c-bb40-41d7ffbe3e18
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
Location: /v1/accounts/qa-5508c2c6611e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b62bb1c-7b9c-49d4-8027-4a481548a64e","handle":"qa-5508c2c6611e","displayName":"QA 5508c2c6611e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.035580696Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c1252360-75dc-4cd5-94fe-c6f8b465d9ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1252360-75dc-4cd5-94fe-c6f8b465d9ac
Content-Type: application/json

--- request body ---
{"handle":"qa-77829fd897d2","displayName":"QA 77829fd897d2","password":"****","region":"eu"}

--- response: 201 in 69 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1252360-75dc-4cd5-94fe-c6f8b465d9ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-77829fd897d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3574462b-4b3e-4c64-a8b0-11eb7fdcb993","handle":"qa-77829fd897d2","displayName":"QA 77829fd897d2","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.412132440Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-70962310-d55f-4fb2-9eff-f0b5c047bbd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70962310-d55f-4fb2-9eff-f0b5c047bbd5
Content-Type: application/json

--- request body ---
{"handle":"qa-ee843bdf0b4e","displayName":"QA ee843bdf0b4e","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-70962310-d55f-4fb2-9eff-f0b5c047bbd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-ee843bdf0b4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3c47c84-1e6f-4754-8207-3dcb6faf6c48","handle":"qa-ee843bdf0b4e","displayName":"QA ee843bdf0b4e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.472761070Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b749fc43-18ad-4b89-8ea2-c671c4321186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b749fc43-18ad-4b89-8ea2-c671c4321186
Content-Type: application/json

--- request body ---
{"handle":"qa-5508c2c6611e","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b749fc43-18ad-4b89-8ea2-c671c4321186
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b62bb1c-7b9c-49d4-8027-4a481548a64e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-22b9edf0-12bc-4eff-9fc4-1dbb4498d4bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b9edf0-12bc-4eff-9fc4-1dbb4498d4bc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-77829fd897d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-22b9edf0-12bc-4eff-9fc4-1dbb4498d4bc
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
Location: /v1/conversations/cnv_b80e6687-d231-4059-a6b7-95c6329f62ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b80e6687-d231-4059-a6b7-95c6329f62ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-5508c2c6611e","qa-77829fd897d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.548937221Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-84b3a7a1-9cc4-478a-b338-d2d27787b12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84b3a7a1-9cc4-478a-b338-d2d27787b12d
Content-Type: application/json

--- request body ---
{"handle":"qa-ee843bdf0b4e","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-84b3a7a1-9cc4-478a-b338-d2d27787b12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3c47c84-1e6f-4754-8207-3dcb6faf6c48"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b80e6687-d231-4059-a6b7-95c6329f62ca
correlation: qa-b32ace23-efcd-43b0-8ca7-2110e4494c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b32ace23-efcd-43b0-8ca7-2110e4494c76
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b32ace23-efcd-43b0-8ca7-2110e4494c76
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b80e6687-d231-4059-a6b7-95c6329f62ca","correlationId":"qa-b32ace23-efcd-43b0-8ca7-2110e4494c76"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de8eb48e-c56d-4693-a5ce-e2bf5f561896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8eb48e-c56d-4693-a5ce-e2bf5f561896
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de8eb48e-c56d-4693-a5ce-e2bf5f561896
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
correlation: qa-138c2c46-8732-4df0-ac35-ac23834b5327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138c2c46-8732-4df0-ac35-ac23834b5327
Content-Type: application/json

--- request body ---
{"handle":"qa-ee843bdf0b4e","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-138c2c46-8732-4df0-ac35-ac23834b5327
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-138c2c46-8732-4df0-ac35-ac23834b5327"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-179b5cac-df59-466a-9a37-043606ab6a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-179b5cac-df59-466a-9a37-043606ab6a51
Content-Type: application/json

--- request body ---
{"handle":"qa-77829fd897d2","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-179b5cac-df59-466a-9a37-043606ab6a51
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3574462b-4b3e-4c64-a8b0-11eb7fdcb993"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1004353-6894-4f2b-bab3-0d03863b0edc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1004353-6894-4f2b-bab3-0d03863b0edc
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1004353-6894-4f2b-bab3-0d03863b0edc
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
correlation: qa-42df4410-38f5-4626-b839-82464b19896b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42df4410-38f5-4626-b839-82464b19896b
Content-Type: application/json

--- request body ---
{"handle":"qa-77829fd897d2","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42df4410-38f5-4626-b839-82464b19896b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-42df4410-38f5-4626-b839-82464b19896b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f43365d-9a82-45b1-bf24-7387c0260ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f43365d-9a82-45b1-bf24-7387c0260ca9
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f43365d-9a82-45b1-bf24-7387c0260ca9
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
correlation: qa-b82a8e2a-7a75-46f3-96af-99f953a6dce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b82a8e2a-7a75-46f3-96af-99f953a6dce4
Content-Type: application/json

--- request body ---
{"handle":"qa-5508c2c6611e","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b82a8e2a-7a75-46f3-96af-99f953a6dce4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b82a8e2a-7a75-46f3-96af-99f953a6dce4"}
```
